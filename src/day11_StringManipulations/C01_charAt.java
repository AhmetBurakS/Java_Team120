package day11_StringManipulations;

public class C01_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        //ilk harfi yazdirin
        System.out.println(str.charAt(0));


        //7.harfi yazdirin
        System.out.println(str.charAt(6));  //a


        //bu metnin uzunluğu 11
        // son harfi yazdirin
        System.out.println(str.charAt(11-1)); //r

        //sondan 3.harfi yazdirin
        System.out.println(str.charAt(11-3)); //


        // eger sondan basa dogru gelecek sekilde bir char isteniyorsa
        // charAt(uzunluk - sondanKacinciKarakter)


        //metnin uzunlugundan daha buyuk sıradaki bir karakter istenirse
        //20.karakteri yazdirin
        //System.out.println(str.charAt(20));  //StringIndexOutOfBoundsException

        //4.harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(3));

        /*
            charAt()'u bize char data turunde bir sonuc verir (döndürür)
            toUpperCase() gibi methodlar String veriable'lar ile calistigindan
            charAt() calistiktan sonra String Manipulation yapılamaz.
            Eger manipulation ihtiyacı varsa, charAt() kullanilmadan once yapilmalidir.
         */





    }
}
