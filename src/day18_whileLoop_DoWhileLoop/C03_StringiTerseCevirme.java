package day18_whileLoop_DoWhileLoop;

public class C03_StringiTerseCevirme {

    public static void main(String[] args) {

        // soru-3- hile loop kullanarak verilen bir Stringi terse cevirip,
        //         bu halini bize ceviren bir method olusturun.


        System.out.println(metniTerseCevir("Bu is bu kadar"));

        System.out.println(metniTerseCevir("ey edip adanada pide ye"));
    }

    public static String metniTerseCevir (String metin){

        String tersMetin = "";

        int index = metin.length()-1;

        while (index >= 0){

            tersMetin += metin.charAt(index);
            index--;
        }

        return tersMetin;
    }
}
