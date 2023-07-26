package EXERCİSE;

import java.util.Scanner;

public class C02_exercise_2 {

    public static void main(String[] args) {

        // Kullanıcıdan alınan bir sebzenin hangi yemeğe ait olduğunu yazdıran bir program yazın.
        // Örneğin, "Patates" sebzesi için "Patates Kızartması" yemeği önerilebilir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sebze giriniz");
        String sebze = scan.nextLine();

        switch (sebze.toLowerCase()) {

            case "patates" :
                System.out.println("Patates kızarması");
                break;
            case "patlican":
                System.out.println("imam bayildi");
                break;
            case  "lahana":
                System.out.println("kapuska");
                break;
            case "salatalık":
                System.out.println("cacık");
                break;
                    default:
                System.out.println("Bu sebze hakkinda bilgi bulunamadi");







        }







    }
}
