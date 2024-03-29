package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime =LocalTime.now();
        System.out.println("localTime: " + localTime);
        LocalTime localTime1 = LocalTime.of(20,14);
        System.out.println("localTime1: " + localTime1);
        LocalTime localTime2 = LocalTime.of(20,14,23);
        System.out.println("localTime2: " + localTime2);
        LocalTime localTime3 = LocalTime.of(20,14,23,4234231);
        System.out.println("localTime3: " + localTime3);

        // getting values from LocalTime instant
        System.out.println("\n--------------------------------------");
        System.out.println("localTime: " + localTime);
        System.out.println("getHour: "+localTime.getHour());
        System.out.println("getMinute: "+localTime.getMinute());
        System.out.println("CLOCK_HOUR_OF_DAY: "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay: "+localTime.toSecondOfDay());

        // Modify values of LocalTime
        System.out.println("\n--------------------------------------");
        System.out.println("localTime: " + localTime);
        System.out.println("minusHours: "+localTime.minusHours(2));
        System.out.println("ChronoUnit.HOURS: "+localTime.minus(2,ChronoUnit.HOURS));
        System.out.println("MIDNIGHT: "+localTime.with(LocalTime.MIDNIGHT));
        System.out.println("ChronoField.HOUR_OF_DAY: "+localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("plusMinutes: "+localTime.plusMinutes(10));
        System.out.println("withHour: "+localTime.withHour(16));




    }
}
