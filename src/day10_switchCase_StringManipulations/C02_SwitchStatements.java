package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:

            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gun numarası 1-7 arasında olmalıdır");



        }






    }
}
