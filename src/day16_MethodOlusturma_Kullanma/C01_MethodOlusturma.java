package day16_MethodOlusturma_Kullanma;

public class C01_MethodOlusturma {
    //


    public static void main(String[] args) {

        altString("Java guzeldir",3,7);
        altString("Biraz sabir lutfen", 5,4);
        altString("Bu da mi gol degil ?", 11,33);

        String str = "Aramiz bozulmasin";
        altString(str,5,10);

    }  //main method sonu

    public static void altString( String metin, int basIndex, int bitIndex){

        if (basIndex>bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        }else if (basIndex>=metin.length() || bitIndex>= metin.length()){
            System.out.println("verilen index sinirlarin disinda");
        }else{

            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }

        System.out.println("");
    }
}
