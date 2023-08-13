package practice_day08;

import java.time.Duration;
import java.time.LocalDateTime;

// Belirli bir tarih girip o gunden bugune gecen zamani gun saat dakika saniye olarak yazdirin
public class DateTime03 {

    public static void main(String[] args) {

        LocalDateTime startDate = LocalDateTime.of(2017,10,22,19,00);
        LocalDateTime currentDate = LocalDateTime.now();

        Duration duration = Duration.between(startDate,currentDate);

        long day = duration.toDays();
        long hour = duration.toHours();
        long minute = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        System.out.println("Evliligimizde bugun: "+day+". gun "+hour+". saat "+minute+". dakika "+seconds+". saniye");
    }


}
