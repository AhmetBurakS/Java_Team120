package day30_ImmutableClasses;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time); // 22:37:09.046579

        System.out.println(time.getHour()); // 22

        System.out.println(time.getMinute()); // 40

        System.out.println(time.minusMinutes(1000)); // 06:02:53.052884

        System.out.println(time.minusHours(100));  // 18:42:53.052884

        System.out.println(time.plusSeconds(10000)); // 01:31:12.969198

        System.out.println(time.withHour(15)); // 15:44:32.969198

        System.out.println(time.withSecond(0).withNano(0).withNano(0)); // 22.45

        LocalTime time1 = LocalTime.of(12,35);
        LocalTime time2 = LocalTime.of(14,34);

        System.out.println(time1.isBefore(time2)); // true
        System.out.println(time1.isAfter(time2)); // false

        LocalTime time3 = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("London saati : " + time3);
    }
}
