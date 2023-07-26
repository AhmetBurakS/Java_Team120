package day13_StringManipulations_forLoop;

public class C02_replaceAll {

    public static void main(String[] args) {


        String str = "1Ja4va 8C9a2n5d1i1r.";

        str = str.replace("1","");
        System.out.println(str); //Ja4va 8C9a2n5dir.

        //Sayilarin tamamindan kurtulmak istersek replace metodu yeterli olmaz

        // java da sayilar, ozel karakterler, alfabetik karakterlerin tumuyle islem yapmak isterseniz
        // replaceAll (istenenGrup, yeniDeger)

        // ornegin butun sayilarin yerine hiclik atamak icin

        str= str.replaceAll("\\d","");
        System.out.println(str);    // Java Candir





    }
}
