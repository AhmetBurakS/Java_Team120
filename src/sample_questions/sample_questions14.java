package sample_questions;

import java.util.Scanner;

public class sample_questions14 {

    public static void main(String[] args) {
        
        /*
            Soru 14-)
                Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
                ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
                Örnek:
                char ch1=  'a'
                String name = "Ali bakkala geç gitti."
                Beklenen Çıktı= a sayısı = 3
               
                Ipucu:
                Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
                Sayac adlı bir int variable oluşturarak bunun ile kelimenin 
                kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
         */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen bir karakter giriniz");
        char ch1 = scanner.next().charAt(0);
        
        int sayac = 0;

        for (int i = 0; i < isim.length(); i++) {

            if (isim.charAt(i) == ch1){

                sayac++;
            }
        }
        System.out.println(ch1+" sayisi = "+sayac);
    }
}
