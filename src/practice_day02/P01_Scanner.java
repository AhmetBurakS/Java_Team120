package practice_day02;

import java.util.Scanner;

public class P01_Scanner {

    public static void main(String[] args) {

        //

     Scanner scanner = new Scanner(System.in);
     //System.out.println("Lutfen asagidaki bilgileri giriniz");
     //System.out.print("Adiniz: ");
     //String name = scanner.nextLine();
     //System.out.println();
     //System.out.print("Soyadiniz: ");
     //String surname = scanner.nextLine();
     //System.out.println();
     //System.out.print("Yasiniz: ");
     //int yas = scanner.nextInt();
     //System.out.println();
     //System.out.print("Mail adresiniz: ");
     //String mail = scanner.next();
     //System.out.println();
     //System.out.print("Sıfreniz: ");
     //String sifre = scanner.next();
     //System.out.println();
     //System.out.println("*****     KAYIT BAŞARILI      *****");
     //System.out.println("Adiniz : "+ name);
     //System.out.println("Soyadiniz : "+ surname);
     //System.out.println("Yasiniz : "+ yas);
     //System.out.println("Mail Adresiniz: "+mail);
     //System.out.println("Sifreniz: "+sifre);

       // scanner.close();


        // 2.soru

      //System.out.println("Lutfen alani hesaplanacak olan ucgenin ilgili ayrit degerlerini giriniz");
      //System.out.print("Ucgenin bir kenarinin uzunlugunu girin");
      //double kenar = scanner.nextDouble();
      //System.out.print("O kenara ait yuksekligi giriniz");
      //double yukseklik = scanner.nextDouble();
      //System.out.println("========Bilgileri girilen ucgenin alan hesabi sonucu=======");
      //System.out.println("Ucgenin alani : "+ (kenar*yukseklik)/2);


        System.out.println("Lutfen 2 adet sayi giriniz");
        System.out.println("Birinci Sayi : ");
        double sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayi");
        double sayi2 = scanner.nextDouble();
        System.out.println("Girdiginiz 1.Sayi :" +sayi1+"dir\n" +
                            "Girdiginiz 2.sayi :"+sayi2+"dir"  );
        System.out.println("------Hokus Pokus-----");

        //sayi1=5  sayi=3
        sayi1 = sayi1+sayi2;
        sayi2 = sayi1-sayi2;
        sayi1 = sayi1-sayi2;

        System.out.println("Degisen sayi: " + sayi1);
        System.out.println("Degisen sayi: " + sayi2);





    }
}
