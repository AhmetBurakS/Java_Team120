package practice_day05;

public class PalindromicSayi {

    public static void main(String[] args) {

        /*
            palindromik sayi her iki tarafindan da okundugunda
            ayni degeri ifade eden sayidir.
            ORN: 9009 - 12321 - 121
         */

        //3 basamakli sayilarin carpimiyla olusan en buyuk palindromik sayi bulan kodu yaziniz

        int flag=1;
        int maxbas1 =100;
        int maxbas2 =100;
        int maxbas3 =100;


        for (int i = 1000; i >100 ; i--) {

            for (int j = 1000; j >i ; j--) {
                if (chechpalindromic(i*j)){
                    flag++;
                    if (maxbas3<i*j){
                        maxbas3=i*j;
                        maxbas1=i;
                        maxbas2=i;
                    }
                }
            }

        }
        System.out.println("Max. Pal. Sayi= ");
    }

    public static boolean chechpalindromic(int i){
        boolean result = false;
        int sayi= i;

        int digit1 = sayi%10;
        sayi /= 10;
        int digit2 = sayi%10;
        sayi/=10;
        int digit3 = sayi%10;
        sayi/=10;
        int digit4 = sayi%10;
        sayi/=10;
        int digit5 = sayi%10;
        sayi/=10;
        int digit6 = sayi%10;
        sayi/=10;
        int digit7 = sayi;


        if (i<=1000000){
            if (digit1==digit6 && digit2==digit5 && digit3==digit4){
                result = true;
            }else{

            }
        }

        return result;
    }
}
