package day13_StringManipulations_forLoop;

import java.util.Scanner;

public class C03_ReplaceAll {

    public static void main(String[] args) {

        //kullanicidan bir metin isteyin
        //metindeki tum sayilari ve space disindaki ozel karakterleri temizleyin
        //metnin sonuna da . koyun
        //ornek input: "J1*2av4.a C67/an=+dir--_"
        //      output: "Java Candir."

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen istediginiz mesaji girin");
        String metin= scan.nextLine();

        //once sayilardan kurtulalim
        metin= metin.replaceAll("\\d",""); //

        //ozel karakterlerden kurtulmak istedigimizde space de kaybolur
        //bunun icin once space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun icin space yerine herhangi bir sayiyi atayalim
        metin= metin.replaceAll("\\s","1");


        //ozel karakterlerden kurtulalim
        metin= metin.replaceAll("\\W","");

        //space yerine atadigimiz 1'i yeniden space yapalim

        metin= metin.replaceAll("1"," ");

        metin= metin.replaceAll("_","");

        metin= metin + ".";


        System.out.println(metin);



    }
}
