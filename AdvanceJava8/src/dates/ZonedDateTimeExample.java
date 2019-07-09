package dates;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: "+zonedDateTime);
        System.out.println("getOffset: "+zonedDateTime.getOffset());
        System.out.println("getZone ID: "+zonedDateTime.getZone());


       // ZoneId.getAvailableZoneIds().stream().forEach(s -> System.out.println(s));

        System.out.println("Number of Zones: "+ ZoneId.getAvailableZoneIds().size());
        System.out.println("Istanbul CST: "+ZonedDateTime.now(ZoneId.of("Asia/Istanbul")));

        System.out.println("ZonedDateTime using clock: "+
                ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Istanbul"))));

        System.out.println("LocalDateTime using ZoneId: "+
                LocalDateTime.now(ZoneId.of("Asia/Istanbul")));

        System.out.println("LocalDateTime using clock: "+
                LocalDateTime.now(Clock.system(ZoneId.of("Asia/Istanbul"))));

        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ofInstant: "+localDateTime);


        //Convert from LocalDateTime, instant to ZonedLocalDate and time

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("localDateTime1: "+localDateTime1);
        ZonedDateTime zonedDateTime1 = localDateTime1.atZone(ZoneId.of("Asia/Istanbul"));
        System.out.println("zonedDateTime1: "+zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Asia/Istanbul"));
        System.out.println("zonedDateTime2: "+zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime1.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime: "+offsetDateTime);
    }
}




