package practice_day06;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {

          /*
        Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
        Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
        bilince de tebrik edip durduran bir kod yazalim
        */

        //int sayi = 138;
        Random random = new Random();
        int sayi = random.nextInt(150);// 0-150 arasinda bir sayi uret

        System.out.println("Aklimdan bir sayi tuttum, hadi tahmin et");
        Scanner scan=new Scanner(System.in);
        boolean dogruMu = false;

        while (!dogruMu){
            int tahmin = scan.nextInt();
            if (tahmin>sayi){
                System.out.println("Cok soyledin dusur");
            }else if (tahmin<sayi){
                System.out.println("Dusuk soyledin arttir");
            }else if (tahmin==sayi){
                System.out.println("Tebrikler, bildiniz");
                dogruMu=true;
            }else{
                dogruMu=false;
            }
        }





    }
}
