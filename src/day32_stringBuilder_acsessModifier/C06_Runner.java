package day32_stringBuilder_acsessModifier;

public class C06_Runner {
    public static void main(String[] args) {

        C05 obj = new C05();

        // System.out.println(obj.priviteSayi);
        // privite class uyelerine class disindan hicbir sekilde ulasilamaz

        System.out.println(obj.defaultSayi); // 0
        obj.defaultSayi =  20;
        System.out.println(obj.defaultSayi); // 20


        System.out.println(obj.protectedSayi); //0
        obj.protectedSayi = 30;
        System.out.println(obj.protectedSayi); // 30

        System.out.println(obj.publicSayi); // 0
        obj.publicSayi = 50;
        System.out.println(obj.publicSayi); // 50
    }
}
