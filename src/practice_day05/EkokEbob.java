package practice_day05;

import java.util.Scanner;

public class EkokEbob {

    public static void main(String[] args) {

        // Kullanıcıdan 2 tamsayı alın ve EBOB (En Büyük Ortak Bölen)
        // ve EKOK(En Küçük Ortak Kat) değerlerini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen bir tamsayi daha giriniz");
        int sayi2 = scanner.nextInt();

        int flag = 0;
        System.out.println("Girdiginiz sayilar sirasiyla: "+sayi1+"-"+sayi2);

        //Once EBOB hesaplamasi yapalim
        // ilk olarak kucuk sayiyi ebob degiskenine atiyorum

        int limitEbob = 0;
        if (sayi1<sayi2){
            limitEbob = sayi1;
        }else{
            limitEbob=sayi2;
        }

        //Atanan limitEbob degerini birer azaltarak en buyuk ortak boleni buluyoruz
        //30 degerinden baslayip 1'er azaltarak ikisini de bolebilecek en buyuk sayiyi ariyoruz

        for (int i = limitEbob; i>=2; i--){
            if (sayi1%i==0 && sayi2%i==0){
                System.out.println("Bu sayilarin EBOB degeri : "+i);
                flag++;
                break;
            }

            }

        //flag degerinin hic artmamasi ortak bolen bulamadigi anlamina gelir
        if (flag ==0){
            System.out.println("Bu iki sayinin ortak boleni yoktur.");
        }
        //Girilen sayilarin Ekok degerini bulalim
        flag = 0;
        // for loop yazarken 1'den baslayip bir limit koyarak i degerini 1'er arttirarak ilerleyecegiz.
        System.out.println("Lutfen Ekok degeri olabilecek maksimum limiti giriniz");
        int limit = scanner.nextInt();

        for (int i = 1; i < 100000; i++) {
            if (i%sayi1==0 && i%sayi2==0){
                System.out.println("Girdiginiz sayilarin Ekok degeri: "+i);
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girdiginiz sayilarin belirttiginiz limitten kucuk bir Ekok degeri yoktur");
        }
    }
}
