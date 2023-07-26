package sample_questions;

import java.util.Scanner;

public class sample_questions13 {

    public static void main(String[] args) {

        /*
            Soru 13-)
            Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
            Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
            Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
            Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
            Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
            Ipucu:
            Switch konusunu hatırlayalım!
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cevabinizi giriniz :  \na\nb\nc");
        String cevapStr = scanner.next();
        char cevap = cevapStr.toLowerCase().charAt(0);


        switch(cevap){
            case 'a':
                System.out.println("İsteğiniz işleniyor");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }
    }
}
