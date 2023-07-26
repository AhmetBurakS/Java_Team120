package day08_ifelseStatements;

import java.util.Scanner;

public class C04_ifelseifstatement {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi %3 ==0 && girilenSayi %5 == 0) {
            System.out.println("super sayi");
        } else if (girilenSayi %3 == 0 ) {
            System.out.println("3'un kati");
        } else if (girilenSayi % 5 ==0 ); {
            System.out.println("5'in kati");
        }







    }
}
