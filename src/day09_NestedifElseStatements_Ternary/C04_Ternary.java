package day09_NestedifElseStatements_Ternary;

public class C04_Ternary {

    public static void main(String[] args) {

        // input olarak verilen bir sayinin 3 ile tam bolunup bolunmedigini bulun

        int input = 20;

        // input % 3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor " ;
        // ternary bize bir string donduruyor.
        // bunu ya direkt yazdirmalisiniz
        // VEYA bir string veriable'a atamalisiniz

        System.out.println(input % 3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor ");

        String sonuc = input % 3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor " ;

        System.out.println(sonuc);

        // verilen iinput ciftsayi ise "cift sayi" yazdirin
        // input tek sayi ise 2 * input sonucunu veren bir ternary yazin


        //System.out.println(input % 2 == 0 ? "cift sayi" : 2 * input);




    }
}
