package day06_concatination_matematiksel_operatorler;

public class C02_Karsilastirma_Operatorleri {

    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        // Java'da eşittir isareti karsilastirma degil, atama isaretidir. (asignment)

        b = 2 * a ;


        // Java'da esitligi kontrol etmek istersek == kullaniriz


        System.out.println(b == 2*a); // 20 == 20 ==> true


        // asignment'da esitligin sol tarafinda sadece veriable bulunur.
        // sol tarafta matematiksel islem olmaz
        // karsilastirma operatorlerinde iki tarafta da islem olabilir


        System.out.println( 3*b > 5*a ); // 60 > 50 ==> true

        System.out.println( b >= b-a );  // 20 >= 10 ==> true

        System.out.println( a <= b-a );  // 10 <= 10 ==< true



        // Java' da karsilastirma operatorlerinde kullanilan
        // boolean degeri tersine cevirir


        System.out.println( a< b );

        System.out.println( !  (a < b) );

        System.out.println( a  != b );  // true

























    }
}
