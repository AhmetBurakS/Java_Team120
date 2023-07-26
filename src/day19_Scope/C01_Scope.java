package day19_Scope;

public class C01_Scope {

    static int classLevelStatic = 12;
    String strClassLevelStaticOlmayan = "Java Guzeldir";


    public static void main(String[] args) {

        int sayiMain = 20;

        for (int i = 0; i < 10; i++) {
            int sayiForLoop=5;
        }
    }

    public static void staticMethod(){

        String strStaticMethod = "Java Candir";
    }


    public void staticOlmayanMethod(){

        boolean blStaticOlmayanMethod = true;
    }

    /*
        Scope temelde 2'ye ayrilir
        1- Local veriable'lar
            A - scope'lari icinde olusturulduklari kod blogudur
                bir method'da olusturulan veriable, baska method'dan kullanılamaz
            B - Loop Scope'u
                bir loop icerisinde olusturulan veriable
                sadece o loop icerisinde kullanilabilir
                olusturuldugu method'da loop'un disinda da Kullanilmaz

            NOT :
     */



}
