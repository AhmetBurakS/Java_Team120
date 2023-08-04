package day29_passbyValue;

public class C03_passByValue {

    public static void main(String[] args) {

        int sayi = 10;

        /*
            verilen sayiyi asagidaki kriterlere gore degistiren
            bir method olusturun

            - eger sayi cift sayi ise 2 katına cikarin
            - eger sayi tek ise 5 ekleyin

         */
        System.out.println("method call'dan once sayi : "+sayi);

        sayi = degisenSayi(sayi);

        System.out.println("method call'dan sonra sayi : "+sayi);
    }

    public static int degisenSayi(int sayi){

        if (sayi % 2==0){
            return  2 * sayi;
        }else{
            return sayi+5;
        }
    }
}
