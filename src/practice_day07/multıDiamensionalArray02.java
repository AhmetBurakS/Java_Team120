package practice_day07;

import java.util.Scanner;

public class multıDiamensionalArray02 {

    // 4x2'lik bir multidimension array oluşturun ve içine çeşitli şehir ve nüfus bilgileri ekleyin.
    // Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.

    public static void main(String[] args) {

        String [][] sehirlerNufuslar = {
                {"Ankara","5.000.000"},
                {"Kırıkkale","277.000"},
                {"Adana","2.000.000"},
                {"Elazig","450.000"},
                {"Amsterdam","1.100.000"}
        };

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen nufusunu ogrenmek istediginiz sehrin ismini giriniz");

        String arananSehir = scan.next();

        boolean kontrol = false;
        for (int i = 0; i < sehirlerNufuslar.length; i++) {

            if (arananSehir.equalsIgnoreCase(sehirlerNufuslar[i][0])){
                System.out.println(arananSehir+" sehrinin nufusu: "+sehirlerNufuslar[i][1]);
                kontrol= true;
                break;

            }

        }
        if (!kontrol){
            System.out.println("Girdiginiz sehrin nufusu datalarimizda mevcut degil");
        }



    }



}


































/*
    public static void main(String[] args) {

        String [][] sehirlerNufuslar = {
                {"Ankara","5.000.000"},
                {"Kırıkkale","277.000"},
                {"Adana","2.000.000"},
                {"Elazig","450.000"},
                {"Amsterdam","1.100.000"}
        };

        //kullanicidan sehir adini alalim
        Scanner sehir= new Scanner(System.in);
        System.out.println("Nufusunu ogrenmek istediginiz sehri yaziniz: ");
        String arananSehir = sehir.next();

        boolean kontrol = false;
        for (int i = 0; i < sehirlerNufuslar.length; i++) {
            if (arananSehir.equalsIgnoreCase(sehirlerNufuslar[i][0])){
                System.out.println(arananSehir+" sehrinin nufusu: "+sehirlerNufuslar[i][1]);
                kontrol = true;
                break;
            }

        }
        if (!kontrol){
            System.out.println("Girdiginiz sehrin nufusu datalarimizda mevcut degil");
        }

    }
 */
