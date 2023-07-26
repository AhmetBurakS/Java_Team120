package day11_StringManipulations;

import java.util.Scanner;

public class C06_Soru {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String girilenMail = scanner.nextLine();

        if (! girilenMail.contains("@")) {
            System.out.println("gecersiz mail");

        }else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        }else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }






    }
}
