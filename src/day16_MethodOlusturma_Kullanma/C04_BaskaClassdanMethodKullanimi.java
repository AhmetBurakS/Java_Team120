package day16_MethodOlusturma_Kullanma;

import practice_day02.C03_MethodOlusturma;

public class C04_BaskaClassdanMethodKullanimi {

    public static void main(String[] args) {


        C01_MethodOlusturma.altString("Method",1,3);  // et

        System.out.println(C03_MethodOlusturma.isimDuzenle("bugra", "CAN"));  //Bugra Can

        String isimDuzenli = C03_MethodOlusturma.isimDuzenle("mehmet","kemal");  // 12

        //duzenlemis ismin uzunlugunu yazdirin
        System.out.println(isimDuzenli.length());

        /*
            Void olan method'da sonucu kaydedemeyiz, sadece yazdiririz

            bize deger donduren method'da ise sonucu istersek direkt yazdirir, istersek de kaydederiz
         */


    }
}
