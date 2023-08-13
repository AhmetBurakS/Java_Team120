package practice_day08;

// Soru: Verilen bir tarihten belirli gün sayısını ekleyerek gelecekteki bir tarihi hesaplayan bir

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateClass02 {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2023,8,12); //Baslangic tarihini belirledik
        LocalDate futureDate = calculateFutureDate(startDate,120); //120 gun sonrasini hesaplayacak
        System.out.println("120 gun sonrasi: "+futureDate);
    }
    static LocalDate calculateFutureDate(LocalDate startDate, long addDay) {

        return startDate.plus(addDay, ChronoUnit.DAYS);
    }



}
