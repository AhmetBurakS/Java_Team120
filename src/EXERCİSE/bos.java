package EXERCİSE;

public class bos {

    private int gizliNo ;
    protected String str = "";
    public int herkeseAcik;
    int defaultSayi;



    public static void main(String[] args) {



        StringBuilder str = new StringBuilder("Anlamak cok da zor degil");
        StringBuilder str1 = new StringBuilder("Anlamak cok da zor degil");
        System.out.println(str.compareTo(str1));

        String metin = "Adana demir spor";

        str.insert(7,metin,5,11);
        System.out.println(str);

        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);

        System.out.println(str.toString().contains("cok"));
        System.out.println(str.toString().toLowerCase());

        System.out.println(str);




    }

}
