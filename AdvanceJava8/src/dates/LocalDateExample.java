package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate  = LocalDate.now(); System.out.println("localDate: "+localDate);
        LocalDate localDate1 = LocalDate.of(2018,3,13);  System.out.println("localDate1: "+localDate1);
        LocalDate localDate2 = LocalDate.ofYearDay(2018,134);   System.out.println("localDate2: "+localDate2);

        // Get values from localDate
        System.out.println("--------------------------------------");
        System.out.println("localDate: "+localDate);
        System.out.println("getMonth: "+localDate.getMonth());
        System.out.println("getMonthValue: "+localDate.getMonthValue());
        System.out.println("getDayOfMonth: "+localDate.getDayOfMonth());
        System.out.println("getDayOfWeek: "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear: "+localDate.getDayOfYear());
        System.out.println("ChronoField.DAY_OF_MONTH: "+localDate.get(ChronoField.DAY_OF_MONTH));

        // Modifying LocalDate
        System.out.println("\n--------------------------------------");
        System.out.println("localDate: "+localDate);
        System.out.println("plusDays: "+localDate.plusDays(2));
        System.out.println("plusDays: "+localDate.plusDays(2));
        System.out.println("minusDays: "+localDate.minusDays(1));
        System.out.println("withYear: "+localDate.withYear(2020));
        System.out.println("with ChronoField: "+localDate.with(ChronoField.YEAR,2020));
        System.out.println("with TemporalAdjusters: "+localDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("chronounit minus: "+localDate.minus(1,ChronoUnit.YEARS));

        // Additional Support methods
        System.out.println("\n--------------------------------------");
        System.out.println("is supoorted ChronoUnit: "+localDate.isSupported(ChronoUnit.YEARS));
        System.out.println("is supoorted ChronoField: "+localDate.isSupported(ChronoField.DAY_OF_WEEK));

        System.out.println("isEqual: "+localDate.isEqual(localDate1));
        System.out.println("isBefore: "+localDate.isBefore(localDate1));
        System.out.println("isAfter: "+localDate.isAfter(localDate1));
    }
}


