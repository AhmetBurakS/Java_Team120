package day06_concatination_matematiksel_operatorler;

public class C04_Or_Operatoru {

    public static void main(String[] args) {


        /* Or operatoru iyimserdir
           yani tek bir true bile yeterli olur
           or operatorunde tum mantiksal ifadeler false ise sonuc false
           degilse sonuc true olur


           or operatoru matematikteki toplama islemine benzer
           toplanan sayilarda bir tane bile 0 olmayan varsa sonuc 0 olmaz.


           0+0+0+0+0 = 0
           2+0+0+0+0 = 2

         */


        System.out.println( 3 > 5 || 6 > 4 );   // false || true = true
        System.out.println( 3 <5 || 6 > 4 );    // true  || true = true
        System.out.println( 3<5 || 6<4 );       // true || false = true
        System.out.println( 3>5 || 6<4 );       // false || false = false


        int sayi = 24;

        System.out.println( sayi % 3 == 0 ||  sayi % 5 == 0);  // true || false ==> true



    }
}
