#<img src="https://raw.githubusercontent.com/solidfire/solidfire-sdk-java/gh-pages/Java-SDK-Icon-RGB-02.png" height="50" width="50" > SolidFire Java SDK Examples

## Snapshot Scheduling

These examples walk through all interactions with a Schedule. Schedules control when automatic Snapshots will be taken of volumes on the SolidFire cluster.

Examples for:

- [List all Schedules](#list-all-schedules)
- [Get one Schedule](#get-one-schedule)
- [Create a Schedule](#create-a-schedule)
- [Modify a Schedule](#modify-a-schedule)

### Documentation

Further documentation for each method and type can be found at our [Java documentation site](http://solidfire.github.io/solidfire-sdk-java/doc/1.1.0.79). 

### List all Schedules

To list all the schedules on a cluster:

``` java
    // Create Connection to SF Cluster
    SolidFireElement sfe = ElementFactory.create("mvip", "username", "password", "8.0");
    
    // send the request and gather the result
    ListSchedulesResult listSchedulesResult = sfe.listSchedules();
    
    // iterate the schedules array on the result object and display each Schedule
    for (Schedule schedule : listSchedulesResult.getSchedules()) {
        System.out.println(schedule);
    }
```

### Get one Schedule

To get a single schedule:

``` java
    // Create Connection to SF Cluster
    SolidFireElement sfe = ElementFactory.create("mvip", "username", "password", "8.0");
    
    // send the request and gather the result
    GetScheduleResult getSchedulesResult = sfe.getSchedule(56L);
    
    // display the schedule from the result object
    System.out.println(getSchedulesResult.getSchedule());
```

### Create a Schedule

In order for automatic snapshots to be taken, you need to create a schedule. There are three types of schedules that can be created:

- [Time Interval](#time-interval-schedule) 
- [Days Of Week](#days-of-week-schedule)
- [Days Of Month](#days-of-month-schedule)

All three types of schedules are demonstrated here:

##### Time Interval Schedule

This type of schedule will base snapshots on a time interval frequency. Each snapshot will be taken after the specified amount of time has passed. Control the duration by setting days, hours, and minutes on the TimeIntervalFrequency object.

``` java
    Schedule schedule = Schedule.builder()
                                .name("SnapshotEvery3AndAHalfDays")
                                .frequency(new TimeIntervalFrequency(0L, 12L, 3L))
                                .build();
```

##### Days Of Week Schedule

This type of schedule will base snapshots on a weekly frequency. Each snapshot will be taken on the specified weekdays at the time specified in the hours and minutes properties. Control the schedule by setting weekdays, hours, and minutes on the DaysOfWeekFrequency object.

``` java
    Schedule schedule = Schedule.builder()
                                .name("SnapshotOnMonWedFriAt3am")
                                .frequency(new DaysOfWeekFrequency(0L, 3L, new Weekday[]{Weekday.Monday, Weekday.Wednesday, Weekday.Friday}))
                                .build();
```

##### Days Of Month Schedule

This type of schedule will base snapshots on a monthly frequency. Each snapshot will be taken on the specified month days at the time specified in the hours and minutes properties. Control the schedule by setting monthdays, hours, and minutes on the DaysOfMonthFrequency object.

``` java
    Schedule schedule = Schedule.builder()
                                .name("SnapshotOn7th14thAnd21stAt0130Hours")
                                .frequency(new DaysOfMonthFrequency(30L, 3L, new Long[]{7L, 14L, 21L}))
                                .build();
```

#### Create a Schedule (cont.)

After creating the schedule and setting the frequency to Time Interval, Days Of Week, or Days Of Month, complete the object by setting the `ScheduleInfo` property. This controls information about the resulting snapshot such as which volumes are in it, its name, and how long it should be retained.

Continuing on with the [Time Interval](#time-interval-schedule) example from above:

```java
    Schedule.Builder scheduleBuilder = Schedule.builder()
                                               .name("SnapshotEvery12Hours")
                                               .frequency(TimeIntervalFrequency.builder().hours(12L).build());

    scheduleBuilder.scheduleInfo(ScheduleInfo.builder()
                                             .optionalVolumeIDs(new Long[]{1L, 3L, 5L})
                                             .optionalSnapshotName("12th hour snapshot")
                                             .optionalRetention("72:00:00") // in HH:mm:ss format
                                             .build());
    
    // When should the schedule start?
    scheduleBuilder.startingDate("2016-12-01T00:00:00Z"); // in UTC format

    Schedule schedule = scheduleBuilder.build();

    // Create Connection to SF Cluster
    SolidFireElement sfe = ElementFactory.create("mvip", "username", "password", "8.0");

    // call the CreateSchedule method with the newly created schedule object
    CreateScheduleResult createScheduleResult = sfe.createSchedule(schedule);

    // Grab the schedule ID from the result object
    Long newScheduleId = createScheduleResult.getScheduleID();
```

At this point we have created a new schedule called SnapshotEvery12Hours that creates a snapshot whose name is prepended with "12th hour snapshot" every 12 hours for volumes 1, 3, and 5 that is retained for 72 hours.

### Modify a Schedule

To modify a schedule, first you must have a valid schedule object with its `ScheduleID` set. You can create one manually but it is preferred to retrieve it from the cluster, modify the properties needed and then send it back. Here is an example:

``` java
    // Create Connection to SF Cluster
    SolidFireElement sfe = ElementFactory.create("mvip", "username", "password", "8.0");

    // send the requst with the scheduleID and gather the result
    GetScheduleResult getScheduleResult = sfe.getSchedule(9L);

    // set a schedule variable from the Schedule in the result for ease of use
    Schedule schedule = getScheduleResult.getSchedule();

    // display the retrieved schedule
    System.out.println(schedule);

    // set paused to true in order to pause the schedule
    Schedule.Builder scheduleBuilder = schedule.asBuilder().optionalPaused(true);

    // send the request to modify this schedule
    sfe.modifySchedule(scheduleBuilder.build());

    // send another GetSchedule request and gather the result
    GetScheduleResult modifiedScheduleResult = sfe.getSchedule(9L);

    // display the newly modified schedule
    System.out.println(modifiedScheduleResult.getSchedule());  
```
