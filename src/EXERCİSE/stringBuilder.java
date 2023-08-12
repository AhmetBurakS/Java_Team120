package EXERCİSE;

public class stringBuilder {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);

        /*String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        if (s1==s2) System.out.println("1");
        if (s1.equals(s2)) System.out.println("2");

         */



        String numbers = "012345678";
        System.out.println(numbers.substring(1,3)); // 12
        System.out.println(numbers.substring(7,7)); // hiçlik
        System.out.println(numbers.substring(7)); //78

        /*int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
        total += letters.substring(6,5).length();
        System.out.println(total);

         */

        StringBuilder strBld = new StringBuilder("ceylan");
        strBld.substring(3);
        System.out.println(strBld);

        StringBuilder strBld1 = new StringBuilder(7);
        StringBuilder sb1 = new StringBuilder(5+7+"Java"+4+5);
        String isim = "Mesut";
        sb.append(isim,2,4);
        sb.delete(4,6);
        sb.subSequence(2,5);
        System.out.println(sb1);

        StringBuilder sb3 = new StringBuilder("OCAJP8");
        sb3.subSequence(2,4);
        sb3.deleteCharAt(3);
        sb3.reverse();
        System.out.println(sb3);
    }
}
