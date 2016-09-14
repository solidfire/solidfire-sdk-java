package com.solidfire.examples;

import com.solidfire.client.ElementFactory;
import com.solidfire.element.api.*;

public class SnapshotSchedulingExample {
    public static void main(String[] args) {
        // Create Connection to SF Cluster
        SolidFireElement sfe = ElementFactory.create("mvip", "username", "password", "8.0");

        // send the request and gather the result
        ListSchedulesResult listSchedulesResult = sfe.listSchedules();

        // iterate the schedules array on the result object and display each Schedule
        for (Schedule schedule : listSchedulesResult.getSchedules()) {
            System.out.println(schedule);
        }


        // send the request and gather the result
        GetScheduleResult getSchedulesResult = sfe.getSchedule(56L);

        // display the schedule from the result object
        System.out.println(getSchedulesResult.getSchedule());


        Schedule schedule1 = Schedule.builder()
                                     .name("SnapshotEvery3AndAHalfDays")
                                     .frequency(new TimeIntervalFrequency(0L, 12L, 3L))
                                     .build();


        Schedule schedule2 = Schedule.builder()
                                     .name("SnapshotOnMonWedFriAt3am")
                                     .frequency(new DaysOfWeekFrequency(0L, 3L, new Weekday[]{Weekday.Monday, Weekday.Wednesday, Weekday.Friday}))
                                     .build();

        Schedule schedule3 = Schedule.builder()
                                     .name("SnapshotOn7th14thAnd21stAt0130Hours")
                                     .frequency(new DaysOfMonthFrequency(30L, 3L, new Long[]{7L, 14L, 21L}))
                                     .build();


        Schedule.Builder scheduleBuilder1 = Schedule.builder()
                                                    .name("SnapshotEvery12Hours")
                                                    .frequency(TimeIntervalFrequency.builder().hours(12L).build());

        scheduleBuilder1.scheduleInfo(ScheduleInfo.builder()
                                                  .optionalVolumeIDs(new Long[]{1L, 3L, 5L})
                                                  .optionalSnapshotName("12th hour snapshot")
                                                  .optionalRetention("72:00:00") // in HH:mm:ss format
                                                  .build());

        // When should the schedule start?
        scheduleBuilder1.startingDate("2016-12-01T00:00:00Z"); // in UTC format

        Schedule schedule4 = scheduleBuilder1.build();

        // call the CreateSchedule method with the newly created schedule object
        CreateScheduleResult createScheduleResult = sfe.createSchedule(schedule4);

        // Grab the schedule ID from the result object
        Long newScheduleId = createScheduleResult.getScheduleID();


        // send the requst with the scheduleID and gather the result
        GetScheduleResult getScheduleResult = sfe.getSchedule(9L);

        // set a schedule variable from the Schedule in the result for ease of use
        Schedule schedule5 = getScheduleResult.getSchedule();

        // display the retrieved schedule
        System.out.println(schedule5);

        // set paused to true in order to pause the schedule
        Schedule.Builder scheduleBuilder2 = schedule5.asBuilder().optionalPaused(true);

        // send the request to modify this schedule
        sfe.modifySchedule(scheduleBuilder2.build());

        // send another GetSchedule request and gather the result
        GetScheduleResult modifiedScheduleResult = sfe.getSchedule(9L);

        // display the newly modified schedule
        System.out.println(modifiedScheduleResult.getSchedule());
    }
}