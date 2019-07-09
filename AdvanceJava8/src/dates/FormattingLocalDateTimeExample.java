package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    public static void parseLocalDateTime(){

        String dateTime="2018-04-18T14:33:33";
        LocalDateTime local = LocalDateTime.parse(dateTime);
        System.out.println("local: "+local);
        LocalDateTime localDateTime
                = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime: "+localDateTime);

        // custom defined format
        String dateTime1 = "2018-04-18T14|33|33";
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("localDateTime1: "+localDateTime1);

        dateTime1 = "2018-04-18abc14|33|33";
        dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        localDateTime1 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("localDateTime1: "+localDateTime1);

    }

    public static void formatLocalDateTime(){
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("convertedDateTime: "+convertedDateTime);

    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();


    }
}
