package EXERCİSE;

import java.util.Scanner;

public class C01_exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir spor dali girin");
        String sporDali = scanner.nextLine();

        switch (sporDali.toLowerCase()) {
            case "futbol":
                System.out.println("Futbol, dünya genelinde popülerdir. Özellikle Brezilya, İspanya ve Arjantin gibi ülkelerde çok tutulur.");
                break;
            case "basketbol":
                System.out.println("Basketbol, özellikle Amerika Birleşik Devletleri'nde (ABD) popülerdir. Ayrıca Avrupa'da da büyük bir takipçi kitlesi vardır.");
                break;
            case "voleybol":
                System.out.println("Voleybol, Brezilya, Amerika Birleşik Devletleri, Rusya, İtalya ve Türkiye gibi ülkelerde popülerdir.");
                break;
            case "tenis":
                System.out.println("Tenis, özellikle Amerika Birleşik Devletleri, İspanya, İsviçre ve Sırbistan gibi ülkelerde popülerdir.");
                break;
            case "golf":
                System.out.println("Golf, Amerika Birleşik Devletleri, İngiltere, İskoçya ve Avustralya gibi ülkelerde popülerdir.");
                break;
            default:
                System.out.println("Bu spor dalı hakkında bilgi bulunamadı.");
                break;

        }





    }
}
