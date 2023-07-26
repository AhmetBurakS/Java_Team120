package day07_ifStatements;

import java.util.Scanner;

public class C07_ifelseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not >= 50 ) System.out.println("sinifi gectin");
        if (not < 50 ) System.out.println("malesef kaldin");

        /* eger bir sart icin sadece 2 durum soz konusu ise
           2 durumu ayri ayri kontrol etmek yerine
           tek bir kontrol ile de yapabiliriz

           bagimsiz if cumlelerinden bagimsiz olarak if else cumlelerinde ya if body'si ya else body'si calisir
           ikisinin birden calismasi mumkun olmadigi gibi ikisinin de calismasi mumkun degildir
         */

        if (not >= 50 ) {
            System.out.println("sinifi gectin");

        } else {
            System.out.println("malesef kaldin");

        }



    }
}
