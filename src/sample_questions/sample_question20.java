package sample_questions;

import java.util.Scanner;

public class sample_question20 {

    public static void main(String[] args) {

        /*
            Soru 20-)
            Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
             Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
            Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
            aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
            yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		        çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir isim giriniz");
        String isim = scanner.nextLine();

        int uzunluk = isim.length();

        char birinciHarf = isim.charAt(0);
        char ikinciHarf = isim.charAt(1);
        char ucuncuHarf = isim.charAt(2);

        if (uzunluk == 3){
            if (birinciHarf == ikinciHarf && birinciHarf == ucuncuHarf){
                System.out.println("Dizede yinelenen karakterler var");
            }else{
                System.out.println("Dize benzersiz karakterlere sahip");
            }

        }else if (uzunluk > 3){
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }




    }
}
