package day13_StringManipulations_forLoop;

public class C01_replace {

    public static void main(String[] args) {

        String str = "Javayi anliyorum ama yazamiyorum";

        //var olan bir stringin istedigimiz bolumunu degistirebiliriz


        System.out.println(str.replace('J', 'T'));

        System.out.println(str.replace('a', '*'));

        System.out.println(str.replace("ama yazamiyorum", "ve yazabiliyorum"));

        System.out.println(str.replace("Java","AA"));

    }
}
