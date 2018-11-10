package com.nibm.features18;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class TestDateTimeCalculation
{
  public static void main(String[] args)
  {
    LocalDate d1 = LocalDate.of(2000, 1, 23);
    System.out.println(d1); // 2000-01-23

    System.out.println(d1.isLeapYear()); // true
    System.out.println(d1.isBefore(LocalDate.of(2000, 12, 30))); // true
    System.out.println(d1.isAfter(LocalDate.of(2000, 12, 30))); // false
    System.out.println(d1.plusDays(2)); // 2000-01-25
    System.out.println(d1.plusWeeks(4)); // 2000-02-20
    System.out.println(d1.plusMonths(6)); // 2000-07-23
    System.out.println(d1.plusYears(8)); // 2008-01-23
    System.out.println(d1.minusDays(2)); // 2000-01-21
    System.out.println(d1.minusWeeks(4)); // 1999-12-26
    System.out.println(d1.minusMonths(6)); // 1999-07-23
    System.out.println(d1.minusYears(8)); // 1992-01-23

    LocalDate d2 = d1.with(TemporalAdjusters.firstDayOfMonth());
    System.out.println(d2); // 2000-01-01
    LocalDate d3 = d1.with(TemporalAdjusters.lastDayOfYear());
    System.out.println(d3); // 2000-12-31

    Period p1 = d1.until(d2.plusYears(10));
    System.out.println(p1); // P9Y11M9D (period of 9 Years 11 months 9 days)
  }
}