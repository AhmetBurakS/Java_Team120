package practice_day08;
// Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

// Örnek çıktı:
// Uzunluk: 8, Genişlik: 6
// Kenar uzunluğu: 5 (Kare)

public class Rectangle {


    int uzunluk;
    int genislik;
    int boyut;

    public Rectangle(int uzunluk, int genislik){
        this.uzunluk = uzunluk;
        this.genislik = genislik;
        display();

    }

    public Rectangle(int boyut){
        this.boyut = boyut;
        this.genislik= boyut;
        display();

    }

    public void display(){

        if (uzunluk==genislik){
            System.out.println("kenar uzunlugu: "+genislik+"(Kare)");
        }else{
            System.out.println("Uzunluk: "+uzunluk+", Genislik: "+genislik);
        }

    }

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(9,9);
        Rectangle rec2 = new Rectangle(9);
    }

    // cevap yanlıs cıkıyor duzelt





}
