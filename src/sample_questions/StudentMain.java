package sample_questions;

public class StudentMain {

    /*
        Soru 44-)
        StudentMaın adında bir class olusturun, ögrenci bilgilerini alın. (ad soyad yas cınsiyet okul)
        Ardından Student adlı bir class olusturun ve içine parametreli constructor koyun, bu parametreler
        Maın classdaki bılgılerı ıstesın.
        Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
        Ardından consolda giriilen bilgileri yazdırın
        Ipucu:
        Bu soruda iki classa ihtiyacımız olacak.
        Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız.
        String isim, int yas, char cinsiyet gibi...
        Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
        bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
        Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız
        ve tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek,
        bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
     */

    String isim = "isim belirtilmedi";
    String soyisim = "Soyisim belirtilmedi";
    int yas ;
    char cinsiyet ;

    @Override
    public String toString() {
        return "Ogrenci bilgileri==>{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                '}';
    }

    public StudentMain(String isim, String soyisim, int yas, char cinsiyet) {

        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.soyisim = soyisim;



    }

    public static void main(String[] args) {

        StudentMain ogrenci1 = new StudentMain("Ahmet Burak","Sarigul",31,'e');

        System.out.println(ogrenci1);
    }


}
