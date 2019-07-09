package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2018,01,01);
        LocalDate localDate1 = LocalDate.of(2018,12,31);

        Period period = localDate.until(localDate1);
        System.out.println("getDays: "+period.getDays());
        System.out.println("getMonths: "+period.getMonths());
        System.out.println("getYears: "+period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println("getDays: "+period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println("getYears: "+period2.getYears());
        System.out.println("toTotalMonths: "+period2.toTotalMonths());

        Period period3 = Period.between(localDate, localDate1);

        System.out.println("getDays: "+period3.getDays()+"  getMonths: "+period3.getMonths()+"   getYears: "+period3.getYears());

        // not compatible with LocalTime, It compatible is with Duraion
       //  Period.between(LocalTime.now(), LocalTime.now().plusHours(12));

    }
}
