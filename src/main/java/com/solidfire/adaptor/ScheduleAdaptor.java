/*
 * Copyright &copy 2014-2016 NetApp, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.solidfire.adaptor;

import com.solidfire.element.api.*;
import com.solidfire.element.apiactual.*;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.utils.ArrayUtils;

import java.util.*;

import static com.solidfire.utils.ArrayUtils.toPrimative;
import static com.solidfire.utils.ArrayUtils.toWrapper;

/**
 * Created by Jason Ryan Womack on 8/11/16.
 */
public class ScheduleAdaptor {

    public static final String TIME_INTERVAL = "Time Interval";
    public static final String DAYS_OF_MONTH = "Days Of Month";
    public static final String DAYS_OF_WEEK = "Days Of Week";
    public static final String FREQUENCY = "frequency";

    /**
     * This adaptor modifies the ApiSchedule object returned by the GetSchedule API call into a Simple Schedule
     * object using the Frequency classes that delineate different types of scheduling frequencies.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a GetScheduleResult with the modified simple schedule object
     * @see com.solidfire.element.api.Frequency
     */
    public static GetScheduleResult getSchedule(SolidFireElement sfe, GetScheduleRequest request) {
        final ApiGetScheduleResult result = sfe.sendRequest("GetSchedule", request, GetScheduleRequest.class, ApiGetScheduleResult.class);

        return new GetScheduleResult(toSchedule(result.getSchedule()));
    }

    /**
     * This adaptor modifies the ApiSchedule object returned by the ListSchedules API call into a Simple Schedule
     * object using the Frequency classes that delineate different types of scheduling frequencies.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a ListScheduleResult with the modified simple schedule objects
     */
    public static ListSchedulesResult listSchedules(SolidFireElement sfe, ListSchedulesRequest request) {
        final ApiListSchedulesResult result = sfe.sendRequest("ListSchedules", request, ListSchedulesRequest.class, ApiListSchedulesResult.class);

        final List<Schedule> schedules = new ArrayList<>();
        for (final ApiSchedule apiSchedule : result.getSchedules()) {
            schedules.add(toSchedule(apiSchedule));
        }

        return new ListSchedulesResult(schedules.toArray(new Schedule[schedules.size()]));
    }

    /**
     * This adaptor modifies the Simple Schedule object, which uses the Frequency classes that delineate different types
     * of scheduling frequencies, into an ApiSchedule object. This API object is passed into the CreateSchedule API call.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a CreateScheduleResult
     */
    public static CreateScheduleResult createSchedule(SolidFireElement sfe, CreateScheduleRequest request) {
        if (request == null || request.getSchedule() == null) {
            throw new ApiException("Invalid Request. Request or Schedule is null or missing.");

        }
        if (request.getSchedule().getScheduleID().isPresent()) {
            throw new ApiException("ScheduleID should not be present. Do not specify ScheduleID when creating a Schedule. One will be assigned upon creation.");
        }

        if (request.getSchedule().getFrequency() == null) {
            throw new ApiException("Frequency is not present. Make sure the schedule object has a value in the frequency property before attempting to create a Schedule.");
        }

        if (request.getSchedule().getScheduleInfo() == null) {
            throw new ApiException("Schedule_info is not present. Make sure the schedule object has a value in the schedule_info property before attempting to modify a Schedule.");
        }

        final ApiSchedule apiSchedule = toApiSchedule(request.getSchedule());
        final ApiCreateScheduleRequest.Builder apiRequest = ApiCreateScheduleRequest.builder()
                                                                                    .optionalHours(apiSchedule.getHours())
                                                                                    .optionalMinutes(apiSchedule.getMinutes())
                                                                                    .optionalMonthdays(apiSchedule.getMonthdays())
                                                                                    .optionalPaused(apiSchedule.getPaused())
                                                                                    .optionalRecurring(apiSchedule.getRecurring())
                                                                                    .scheduleInfo(apiSchedule.getScheduleInfo())
                                                                                    .scheduleName(apiSchedule.getScheduleName())
                                                                                    .scheduleType(apiSchedule.getScheduleType())
                                                                                    .optionalStartingDate(apiSchedule.getStartingDate())
                                                                                    .optionalWeekdays(apiSchedule.getWeekdays())
                                                                                    .attributes(apiSchedule.getAttributes());

        return sfe.sendRequest("CreateSchedule", apiRequest.build(), ApiCreateScheduleRequest.class, CreateScheduleResult.class);

    }

    /**
     * This adaptor modifies the Simple Schedule object, which uses the Frequency classes that delineate different types
     * of scheduling frequencies, into an ApiSchedule object. This API object is passed into the CreateSchedule API call.
     * The result of the API call is then transformed back into a Simple Schedule object.
     *
     * @param sfe     An instance of SolidFireElement
     * @param request The original request object.
     * @return a ModifyScheduleResult with the modified simple schedule objects
     */
    public static ModifyScheduleResult modifySchedule(SolidFireElement sfe, ModifyScheduleRequest request) {
        if (request == null || request.getSchedule() == null  ) {
            throw new ApiException("Invalid Request. Request or Schedule is null or missing.");
        }
        if (!request.getSchedule().getScheduleID().isPresent()) {
            throw new ApiException("ScheduleID is missing. Cannot modify a schedule without a ScheduleID");
        }

        if (request.getSchedule().getFrequency() == null) {
            throw new ApiException("Frequency is not present. Make sure the schedule object has a value in the frequency property before attempting to create a Schedule.");
        }

        if (request.getSchedule().getScheduleInfo() == null) {
            throw new ApiException("Schedule_info is not present. Make sure the schedule object has a value in the schedule_info property before attempting to modify a Schedule.");
        }

        final ApiSchedule apiSchedule = toApiSchedule(request.getSchedule());

        final ApiModifyScheduleRequest.Builder apiRequest = ApiModifyScheduleRequest.builder()
                                                                                    .optionalRunNextInterval(apiSchedule.getRunNextInterval())
                                                                                    .scheduleID(apiSchedule.getScheduleID())
                                                                                    .optionalToBeDeleted(apiSchedule.getToBeDeleted())
                                                                                    .optionalAttributes(apiSchedule.getAttributes())
                                                                                    .optionalHours(apiSchedule.getHours())
                                                                                    .optionalMinutes(apiSchedule.getMinutes())
                                                                                    .optionalMonthdays(apiSchedule.getMonthdays())
                                                                                    .optionalPaused(apiSchedule.getPaused())
                                                                                    .optionalRecurring(apiSchedule.getRecurring())
                                                                                    .optionalScheduleInfo(apiSchedule.getScheduleInfo())
                                                                                    .optionalScheduleName(apiSchedule.getScheduleName())
                                                                                    .optionalScheduleType(apiSchedule.getScheduleType())
                                                                                    .optionalStartingDate(apiSchedule.getStartingDate())
                                                                                    .optionalWeekdays(apiSchedule.getWeekdays());

        final ApiModifyScheduleResult apiResult = sfe.sendRequest("ModifySchedule", apiRequest.build(), ApiModifyScheduleRequest.class, ApiModifyScheduleResult.class);

        return new ModifyScheduleResult();

    }


    public static Schedule toSchedule(final ApiSchedule api) {
        final Schedule.Builder schedule = Schedule.builder();

        schedule.optionalHasError(api.getHasError())
                .lastRunStatus(api.getLastRunStatus())
                .lastRunTimeStart(api.getLastRunTimeStart())
                .name(api.getScheduleName())
                .optionalPaused(api.getPaused())
                .optionalRecurring(api.getRecurring())
                .optionalRunNextInterval(api.getRunNextInterval())
                .optionalScheduleID(api.getScheduleID())
                .startingDate(api.getStartingDate())
                .optionalToBeDeleted(api.getToBeDeleted())
                .scheduleInfo(toScheduleInfo(api.getScheduleInfo()));

        if(api.getAttributes() != null && api.getAttributes().containsKey(FREQUENCY)) {
            switch (api.getAttributes().get(FREQUENCY).toString()) {
                case TIME_INTERVAL:
                    schedule.frequency(TimeIntervalFrequency.builder()
                                                            .days(api.getHours() / 24)
                                                            .hours(api.getHours() % 24)
                                                            .minutes(api.getMinutes())
                                                            .build());
                    break;
                case DAYS_OF_MONTH:
                    schedule.frequency(DaysOfMonthFrequency.builder()
                                                           .hours(api.getHours())
                                                           .minutes(api.getMinutes())
                                                           .monthdays(api.getMonthdays())
                                                           .build());
                    break;
                case DAYS_OF_WEEK:
                    schedule.frequency(DaysOfWeekFrequency.builder()
                                                          .hours(api.getHours())
                                                          .minutes(api.getMinutes())
                                                          .weekdays(toWeekdays(api.getWeekdays()))
                                                          .build());
                    break;
            }
        }
        return schedule.build();
    }

    private static ScheduleInfo toScheduleInfo(final ApiScheduleInfo api) {
        final ScheduleInfo.Builder info = ScheduleInfo.builder();

        info.optionalEnableRemoteReplication(api.getEnableRemoteReplication().orElse(null));
        info.optionalSnapshotName(api.getName().orElse(null));
        info.optionalRetention(api.getRetention().orElse(null));

        final Set<Long> volumeIDs = new HashSet<>();
        if (api.getVolumeID().isPresent()) {
            volumeIDs.add(api.getVolumeID().get());
        }
        if (api.getVolumes().isPresent()) {
            volumeIDs.addAll(Arrays.asList(api.getVolumes().get()));
        }

        info.optionalVolumeIDs(volumeIDs.toArray(new Long[volumeIDs.size()]));

        return info.build();
    }

    private static Weekday[] toWeekdays(final ApiWeekday[] api) {
        final List<Weekday> weekdays = new ArrayList<>();
        for (final ApiWeekday apiDay : api) {
            weekdays.add(Weekday.fromOrdinal(apiDay.getDay()));
        }
        return weekdays.toArray(new Weekday[api.length]);
    }

    public static ApiSchedule toApiSchedule(final Schedule schedule) {
        final ApiSchedule.Builder api = ApiSchedule.builder();

        api.hasError(schedule.getHasError().orElse(null));
        api.lastRunStatus(schedule.getLastRunStatus());
        api.lastRunTimeStart(schedule.getLastRunTimeStart());
        api.scheduleName(schedule.getName());
        api.paused(schedule.getPaused().orElse(null));
        api.recurring(schedule.getRecurring().orElse(null));
        api.runNextInterval(schedule.getRunNextInterval().orElse(null));
        api.scheduleID(schedule.getScheduleID().orElse(null));
        api.startingDate(schedule.getStartingDate());
        api.toBeDeleted(schedule.getToBeDeleted().orElse(null));
        api.scheduleType("Snapshot");
        api.attributes(new HashMap<String, Object>());


        api.scheduleInfo(toApiScheduleInfo(schedule.getScheduleInfo()));

        if (schedule.getFrequency() == null) {
            throw new ApiException("Invalid schedule - no frequency set");
        } else if (schedule.getFrequency().getClass().equals(TimeIntervalFrequency.class)) {

            final TimeIntervalFrequency frequency = (TimeIntervalFrequency) schedule.getFrequency();

            final Map<String, Object> attributes = new HashMap<>();

            attributes.put(FREQUENCY, TIME_INTERVAL);
            api.attributes(attributes);

            if(frequency.getMinutes() == null) {
                api.minutes(0L);
            } else {
                api.minutes(frequency.getMinutes());
            }

            if(frequency.getHours() == null) {
                api.hours(0L);
            } else {
                api.hours(frequency.getDays() * 24 + frequency.getHours());
            }

        } else if (schedule.getFrequency().getClass().equals(DaysOfMonthFrequency.class)) {

            final DaysOfMonthFrequency frequency = (DaysOfMonthFrequency) schedule.getFrequency();

            final Map<String, Object> attributes = new HashMap<>();

            attributes.put(FREQUENCY, DAYS_OF_MONTH);
            api.attributes(attributes);
            api.minutes(frequency.getMinutes());
            api.monthdays(frequency.getMonthdays());

        } else if (schedule.getFrequency().getClass().equals(DaysOfWeekFrequency.class)) {

            final DaysOfWeekFrequency frequency = (DaysOfWeekFrequency) schedule.getFrequency();

            final Map<String, Object> attributes = new HashMap<>();

            attributes.put(FREQUENCY, DAYS_OF_WEEK);
            api.attributes(attributes);
            api.minutes(frequency.getMinutes());

            final List<ApiWeekday> apiWeekdays = new ArrayList<>();

            for (final Weekday weekday : frequency.getWeekdays()) {
                apiWeekdays.add(new ApiWeekday((long) weekday.ordinal(), 1L));
            }

            api.weekdays(apiWeekdays.toArray(new ApiWeekday[apiWeekdays.size()]));
        }

        return api.build();
    }

    private static ApiScheduleInfo toApiScheduleInfo(final ScheduleInfo scheduleInfo) {
        final ApiScheduleInfo.Builder api = ApiScheduleInfo.builder();

        final ScheduleInfo info;
        if(scheduleInfo == null) {
            info = ScheduleInfo.builder().build();
        } else {
            info = scheduleInfo;
        }

        api.optionalEnableRemoteReplication(info.getEnableRemoteReplication().orElse(null));
        api.optionalName(info.getSnapshotName().orElse(null));
        api.optionalRetention(info.getRetention().orElse(null));


        if (!info.getVolumeIDs().isPresent() || info.getVolumeIDs().get().length == 0) {
            throw new ApiException("ScheduleInfo.VolumeIDs are missing. Cannot create or modify a schedule without at least one VolumeID.");
        } else if (info.getVolumeIDs().get().length == 1) {
            api.optionalVolumeID(info.getVolumeIDs().get()[0]);
        } else {
            api.optionalVolumes(info.getVolumeIDs().get());
        }

        return api.build();
    }
}