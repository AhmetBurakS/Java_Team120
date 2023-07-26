package day19_Scope;

public class C03_baskaClassdanClasslevelveriablelaraErisim {


    public static void main(String[] args) {

        System.out.println(C02_ClassLevelVeriablelar.bls); // false
        System.out.println(C02_ClassLevelVeriablelar.strs); // Java
        System.out.println(C02_ClassLevelVeriablelar.sayis); // 0
        System.out.println(C02_ClassLevelVeriablelar.chrs); // a


        C02_ClassLevelVeriablelar obj = new C02_ClassLevelVeriablelar();

        System.out.println(obj.bli);  // false
        System.out.println(obj.stri); // null
        System.out.println(obj.sayii); // 23
        System.out.println(obj.chri);  // ' '


        System.out.println(obj.bls);
        System.out.println(obj.strs);

    }
}
