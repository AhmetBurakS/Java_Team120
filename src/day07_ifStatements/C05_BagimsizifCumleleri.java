package day07_ifStatements;

import java.util.Scanner;

public class C05_BagimsizifCumleleri {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu girin");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        // Java'da 3'lu karsilastirma olmaz
        // ikili karsilastirmalar yapip && veya || operatorleri ile birlestirmeliyiz


        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("eskenar ucgen");

        }

    }
}
