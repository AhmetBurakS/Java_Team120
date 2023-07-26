package day11_StringManipulations;

public class C05_startWith_endWith {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        // str Java ile mi basliyo?
        System.out.println(str.startsWith("Java"));  //true

        // str J ile mi basliyor
        System.out.println(str.startsWith("J"));    //true

        // str Ja ile mi basliyor


        System.out.println(str.startsWith("Java cok guzel")); //true
        // str "Java cok guzel" ilr mi basliyor


        System.out.println(str.startsWith("")); //true

        //5.index'ten sonrasi c ile mi baslar
        System.out.println(str.startsWith("c",5));  // true

        //6.index'ten sonrasi ok ile mi baslar
        System.out.println(str.startsWith("ok",6));  //true



        // "Java cok guzel"


        //str guzel ile mi biter
        System.out.println(str.endsWith("guzel")); //true

        //str el ile mi biter
        System.out.println(str.endsWith("el")); //true


        //str "" ile mi biter
        System.out.println(str.endsWith("")); //true

        //str " " ile mi biter
        System.out.println(str.endsWith(" "));  //false























    }
}
