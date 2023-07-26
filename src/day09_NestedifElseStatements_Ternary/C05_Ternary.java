package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini girin");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>=0
                            ? "Eskenar ucgen" : "Eskenar degil");



    }
}
