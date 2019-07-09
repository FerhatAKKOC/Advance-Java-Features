package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {


    public static void main(String[] args) {

        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2018,4,15,23,46,31,353);
        System.out.println("localDateTime1: " + localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println("localDateTime2: " + localDateTime2);

        // Get values from localDate
        System.out.println("--------------------------------------");
        System.out.println("localDateTime: " + localDateTime);
        System.out.println("getHour: "+localDateTime.getHour());
        System.out.println("getMinute: "+localDateTime.getMinute());
        System.out.println("getDayOfMonth: "+localDateTime.getDayOfMonth());
        System.out.println("ChronoField.DAY_OF_MONTH: "+localDateTime.get(ChronoField.DAY_OF_MONTH));

        // Modifying LocalDate Time
        System.out.println("--------------------------------------");
        System.out.println("localDateTime: " + localDateTime);
        System.out.println("plusHours: " +localDateTime.plusHours(2));
        System.out.println("minusDays: " +localDateTime.minusDays(2));
        System.out.println("withMonth: " +localDateTime.withMonth(8));

        //Converting LocalDate, localTime to LocalDateTime
        LocalDate localDate = LocalDate.of(2019,01,01);
        System.out.println("atTime: "+localDate.atTime(15,32,46,2134));

        LocalTime localTime = LocalTime.of(23,39);
        System.out.println("atDate: "+localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("toLocalDate: "+localDateTime3.toLocalDate());
        System.out.println("toLocalDate: "+localDateTime3.toLocalTime());
    }
}
