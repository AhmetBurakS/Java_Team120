package EXERCİSE;

import java.util.Scanner;

public class MailSorusu {

    public static void main(String[] args) {

        /*
            SORU : kullanicidan bir mail alin
        - mail @ icermiyorsa "gecersiz mail"
        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String mail = scan.nextLine();

        if (!mail.contains("@"))System.out.println("Gecersiz mail");
        if (!mail.contains("@gmail.com")) System.out.println("mail gmail olmali");
        if (!mail.endsWith("@gmail.com")) System.out.println("mailde yazim hatasi var");



    }
}
