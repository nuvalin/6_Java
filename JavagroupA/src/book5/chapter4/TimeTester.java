package book5.chapter4;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.*;

public class TimeTester {
    public static void main(String[] args) {
//        System.out.println("\nLocalTime: " + LocalTime.now().toString());
//        System.out.println("\nLocalDateTime: " + LocalDateTime.now().toString());
//        System.out.println("\nZonedDateTime: " + ZonedDateTime.now().toString());
//        System.out.println("\nOffsetTime: " + OffsetTime.now().toString());
//        System.out.println("\nOffsetDateTime: " + OffsetDateTime.now().toString());
//        System.out.println("\nMonthDay: " + MonthDay.now().toString());
//        System.out.println("\nYearMonth: " + YearMonth.now().toString());
//        System.out.println("\nInstant: " + Instant.now().toString());
//        try {
//            LocalDateTime d = LocalDateTime.parse("2014-12-15T15:45");
//            System.out.println(d);
//        } catch(DateTimeParseException e) {
//                System.out.println(e.getLocalizedMessage());
//            }
//        LocalDate date = LocalDate.of(2014,Month.DECEMBER,15);
//        System.out.println(date);

//        for (String id : ZoneId.getAvailableZoneIds())
//            System.out.println(id);

//        ZoneId z = ZoneId.of("America/Los_Angeles");
//        ZonedDateTime zdate;
//        zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, z);
//        System.out.println(zdate);
//
//        ZoneOffset zo = ZoneOffset.ofHours(-8);
//        OffsetTime o = OffsetTime.of(12, 30, 0, 0, zo);
//        System.out.println(o);

//
//         ZoneOffset zo = ZoneOffset.of("-08:00");
//        OffsetTime o = OffsetTime.of(12, 30, 0, 0, zo);
//        System.out.println(o);
//        LocalDate date = LocalDate.now();
//        System.out.println(date.getYear());
//        System.out.println(date.getMonthValue());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getDayOfYear());
//        System.out.println(date.getDayOfWeek());

//        if (LocalDate.now().equals(LocalDate.now()))
//            System.out.println("All is right in the universe.");
//        else
//            System.out.println("There must be a disturbance " +
//                    "in the space-time continuum!");

//        if (LocalDate.now().getDayOfMonth() < 15)
//            System.out.println("It is not yet the 15th.");

//        System.out.println("Today: " + LocalDate.now());
//        System.out.println("Tomorrow: " + LocalDate.now().plusDays(1));
//        System.out.println("Next week: " + LocalDate.now().plusWeeks(1));
//        System.out.println("Next month: " + LocalDate.now().plusMonths(1));
//        System.out.println("Next year: " + LocalDate.now().plusYears(1));

//        LocalDate date1 = LocalDate.parse("2014-05-16");
//        LocalDate date2 = LocalDate.parse("2014-12-15");
//        System.out.println(date1.until(date2, ChronoUnit.DAYS));

//        DateTimeFormatter formatter;
//        formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
//        LocalDate date = LocalDate.now();
//        System.out.println (date.format(formatter));
//

        LocalDateTime now = LocalDateTime.now();
        printDate(now, "YYYY-MM-dd");
        printDate(now, "MM-dd-YYYY");
        printDate(now, "dd MMM YYYY");
        printDate(now, "MMMM d, YYYY");
        printDate(now, "HH:mm");
        printDate(now, "h:mm a");
    }


    public static void printDate(LocalDateTime date, String pattern) {
        DateTimeFormatter f;
        f = DateTimeFormatter.ofPattern(pattern);
        pattern = (pattern + "           ").substring(0, 14);
        System.out.println(pattern + "  " + date.format(f));
    }
}
