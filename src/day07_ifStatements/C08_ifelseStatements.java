package day07_ifStatements;

import java.util.Scanner;

public class C08_ifelseStatements {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar2>0 ) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("eskenar ucgen degil");

        }
    }
}
