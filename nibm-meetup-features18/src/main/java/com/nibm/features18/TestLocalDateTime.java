package com.nibm.features18;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class TestLocalDateTime
{
  public static void main(String[] args)
  {
    // Test LocalDate
    LocalDate d1 = LocalDate.now();
    System.out.println(d1); // 2018-04-30
    LocalDate d2 = LocalDate.of(2017, Month.JANUARY, 8); // year, month, day
    System.out.println(d2); // 2017-01-08

    // Test LocalTime
    LocalTime t1 = LocalTime.now();
    System.out.println(t1); // 21:24:24.699162200
    LocalTime t2 = LocalTime.of(12, 34, 56, 123456); // hour, minute, second, nanosecond
    System.out.println(t2); // 12:34:56.000123456

    // Test LocalDateTime
    LocalDateTime dt1 = LocalDateTime.now();
    System.out.println(dt1); // 2018-04-30T21:25:38.615116500 (default foramt in ISO_LOCAL_DATE_TIME)

    // Test "Getters"
    LocalDateTime dt2 = LocalDateTime.of(2017, 2, 18, 23, 56, 45, 123456789);
    System.out.println(dt2); // 2017-02-18T23:56:45.123456789
    System.out.println(dt2.getYear()); // 2017
    System.out.println(dt2.getMonth()); // FEBRUARY (using enum java.time.Month)
    System.out.println(dt2.getDayOfMonth()); // 18
    System.out.println(dt2.getHour()); // 23
    System.out.println(dt2.getMinute()); // 56
    System.out.println(dt2.getSecond()); // 45
    System.out.println(dt2.getNano()); // 123456789 (nanosecond)
    System.out.println(dt2.getDayOfWeek()); // SATURDAY (using enum java.time.DayOfWeek)
    System.out.println(dt2.getDayOfYear()); // 49

    // Test "Setters": DateTime classes are immutable. Return a new instance
    LocalDateTime dt2a = dt2.withYear(2018);
    System.out.println(dt2a); // 2018-02-18T23:56:45.123456789
    LocalDateTime dt2b = dt2.withDayOfYear(365);
    System.out.println(dt2b); // 2017-12-31T23:56:45.123456789

    // Test Output Formatter
    LocalDateTime dt3 = LocalDateTime.of(2017, 2, 18, 23, 56, 45);
    // Using formatter with pre-defined constant
    System.out.println(dt3.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2017-02-18
    // Using formatter with pattern
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
    // HH for 24-hour clock, kk for 12-hour clock
    System.out.println(dt3.format(f1)); // 18-Feb-2017 11:56:45

    // Test Input Parser
    LocalDateTime dt4 = LocalDateTime.parse("2017-05-02T23:15:43.967");
    System.out.println(dt4); // 2017-05-02T23:15:43.967
    LocalDateTime dt5 = LocalDateTime.parse("18-Feb-2017 11:56:45", f1);
    System.out.println(dt5); // 2017-02-18T11:56:45

    // You can also create the current date/time specifying a timezone.
    LocalDateTime dt6 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
    System.out.println(dt6); // 2018-04-30T06:50:00.419534
  }
}