package practice_day04;

import java.util.Scanner;

public class P05_SwitchStatements {

    public static void main(String[] args) {

        //Kullanicidan o gunun hangi gun oldugunu girmesini isteyip
        // Haftanin kacinci gunu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun");
        String gun = scan.nextLine();
        gun = gun.toLowerCase();

        switch (gun){
            case "pazartesi" :   //switch case durumunda eger case sayinise direkt yazilir. eger case metin ise " " arasinda yazilir
                System.out.println(gun + "Haftanin 1. gunudur.");
                break;
            case "sali" :
                System.out.println(gun + "Haftanin 2. gunudur.");
                break;
            case "carsamba" :
                System.out.println(gun + "Haftanin 3. gunudur.");
                break;
            case "persembe" :
                System.out.println(gun + "Haftanin 4. gunudur.");
                break;
            case "cuma" :
                System.out.println(gun + "Haftanin 5. gunudur.");
                break;
            case "cumartesi" :
                System.out.println(gun + "Haftanin 6. gunudur.");
                break;
            case "pazar" :
                System.out.println(gun + "Haftanin 7. gunudur.");
                break;
            default:
                System.out.println("Yanlis gun girisi");

        }


    }
}
