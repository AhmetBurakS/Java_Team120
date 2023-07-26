package day07_ifStatements;

public class C01_bagimsizifcumleleri {

    public static void main(String[] args) {

        /*
        Bagimsiz if cumleleri isminden de anlasılacagi uzere
        kodun kalaniyla ilgilenmez.

        sadece boolean sarta odaklanir
        sartin sonucu true ise if body'si calisir
        boolean sartin sonucu false ise
        if body'si devreye girmez.

        YANİ

        birden fazla bagimsiz if cumlesi olan bir kod calistiginda
        kac tane if body'sinin calisacagi verilen degerlere baglidir

        tum if body'leri calisabilir.
        bazilari calisabilir
        ya da hicbir if body'si calismayabilir.

         */


        int a= -201;
        int b= 34;

        if (a>0) {
            System.out.println("a sayisi pozitiftir");
        }

        if (a+b>100) {
            System.out.println("sayilarin toplami 100'den buyuk");
        }

        if (b % 3 == 0) {
            System.out.println("b 3 ile tam bolunen bir tamsayidir");
        }

        if (b<100) {
            System.out.println("b 100'den kucuk bir tamsayidir");
        }


        }
    }

