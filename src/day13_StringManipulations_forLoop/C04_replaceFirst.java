package day13_StringManipulations_forLoop;

public class C04_replaceFirst {

    public static void main(String[] args) {


        String str = "Java Candir, kendisini cok seviyoruz";

        //sadece ilk a'yi buyuk A yapin
        System.out.println(str.replaceFirst("a","A"));

        //ilk space'i iki space haline getirin
        System.out.println(str.replaceFirst(" ", "  "));

        //ilk sayiyi space haline donusturun
        System.out.println(str.replaceFirst("\\d", " "));

        //ilk ozel karakteri * olarak degistirin
        System.out.println(str.replaceFirst("\\W", "*"));


    }
}
