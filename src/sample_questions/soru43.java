package sample_questions;

public class soru43 {

    public static void main(String[] args) {

        /*
            Soru 43-)
        Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
        Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve
        methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
        Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
        Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
        Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
         */

        String ogrenciAdi = "Ahmet Burak";
        String ogrenciSoyadi = "Sarigul";
        int ogrenciYasi = 31;
        String ogrenciSinifi = "T120";
        int ogrenciKayitYili = 2023;

        Changename(ogrenciAdi,ogrenciSoyadi,ogrenciYasi,ogrenciSinifi,ogrenciKayitYili);


    }
    public static void Changename(String ogrenciAdi,String ogrenciSoyadi, int ogrenciYasi,
                                                  String ogrenciSinifi,int ogrenciKayitYili){

        String ogrenciAdiYeni = "Arif";
        String ogrenciSoyadiYeni = "Sariguller";
        int ogrenciYasiYeni = 55;
        String ogrenciSinifiYeni = "T116";
        int ogrenciKayitYiliYeni = 2022;

        ogrenciAdi = ogrenciAdiYeni;
        ogrenciSoyadi = ogrenciSoyadiYeni;
        ogrenciYasi = ogrenciYasiYeni;
        ogrenciSinifi = ogrenciSinifiYeni;
        ogrenciKayitYili = ogrenciKayitYiliYeni;

        System.out.println();
    }
}
