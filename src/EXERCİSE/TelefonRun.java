package EXERCİSE;

public class TelefonRun {

    public static void main(String[] args) {

        Telefon tel1 = new Telefon();

        System.out.println(tel1.fiyat);
        System.out.println(tel1.islemci);

        tel1.fiyat = 5000;
        tel1.model = "A23";
        tel1.marka = "Samsung";

        System.out.println(tel1.model);
    }






}
