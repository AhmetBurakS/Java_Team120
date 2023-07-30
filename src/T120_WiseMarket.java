import java.time.LocalDateTime;
import java.util.Scanner;

public class T120_WiseMarket {

    /*
   Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
   alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince giş yazdıran bir program
   hazırlayın
    ==================== WISE MARKET KASA PROGRAMI ===================================
  ilk programa girildiginde bizi bir menu karsilasin bu secenekler
    1 ŞARKÜTERİ ÜRÜNLERİ
    2 MANAV ÜRÜNLERİ
    3 MARKET ÜRÜNLERİ
    secime gore ,
    4-urunleri listele ve
    5-fiyatlari gelsin
    Variable'ları belirleyelim
    urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam
  */
    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;  //double: ondalıklı sayı için kullanılır
    static double urunMiktari;
    static int urunKodu;     //int : tam sayı değerleri için kullanılır.
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;

    public static void main(String[] args) {
        girisEkrani();
        {
        }
    }

    public static void girisEkrani() {
        System.out.println("================= T120 - WISE MARKET =================");
        System.out.println("=================    Hoşgeldiniz     =================");
        System.out.println("-----------------       Menü         -----------------");
        System.out.println("   Lütfen Alışveriş Yapmak İstediğiniz Reyonu Seçiniz  ");
        System.out.println("1 - Şarküteri \n2 - Manav\n3 - Market\n4 - Fiş Yazdır\n5 - Çıkış");

        int secim = scan.nextInt();
        if ((secim < 1 || secim > 5)) { //if(!(secim>=1 && secim<=5))
            System.out.println(" Uyarı: Geçersiz bir tuşa bastınız. Tekrar Giriniz ");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }

    }

    public static void sarkuteri() {
        System.out.println("Şarkteri Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürün numarasını giriniz.\n61-Kaşar Peyniri 130₺\n62-Zeytin 120₺\n63-Sucuk 200₺\n64-Kıyma 350₺ ");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 61 && urunKodu <= 64) {
                System.out.println("Kaç kg alacaksınız?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 61:
                        urunAdi = "Kaşar Peyniri";
                        urunFiyati = 130;
                        System.out.println(urunMiktari + " kg " + urunAdi + ":" + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 62:
                        urunAdi = "Zeytin";
                        urunFiyati = 120;
                        System.out.println(urunMiktari + " kg " + urunAdi + ":" + (urunFiyati * urunMiktari + " ₺"));
                        break;
                    case 63:
                        urunAdi = "Sucuk";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + " kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 64:
                        urunAdi = "Kıyma";
                        urunFiyati = 350;
                        System.out.println(urunMiktari + " kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + " ₺");
                        break;
                }

                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam);
                sepet += urunAdi + " :" + urunFiyati + "₺\n";
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin.\n Ana Menüye dönmek için 0 tuşuna basınız.");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }
    public static void manav() {
        /*
            Musteriden odedigi miktari alip sisteme giren ve verdigi para yeterli ise para ustunu yazdiran,
            yeterli degilse verdiginiz miktar yeterli degildir diye uyararak kodu ekleyiniz
         */
        System.out.println("Market Reyonuna Hoşgeldiniz");
        System.out.println("Lutfen alacaginiz urun kodunu giriniz: \n81-Nutella - 103₺\n82-Ekmek - 8₺\n83-Yumurta - 76₺\n84-Yogurt - 29₺");
        while (!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=81 && urunKodu<=84){
                System.out.println("Kac kg/paket alacaksiniz?");
                urunMiktari= scan.nextInt();
                switch (urunKodu){
                    case 81:
                        urunAdi="Nutella";
                        urunFiyati=103;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 82:
                        urunAdi="Ekmek";
                        urunFiyati=8;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 83:
                        urunAdi="Yumurta";
                        urunFiyati=76;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 84:
                        urunAdi="Yogurt";
                        urunFiyati=29;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                }
                urunFiyati=urunMiktari*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Olusan sepet tutari: "+toplam);
                sepet+=urunAdi+" : "+urunFiyati+" TL";
                System.out.println("Baska urun almak isterseniz kodunu giriniz. Ana menuye donmek icin 0 tusuna basiniz");
            }else if (urunKodu==0){
                girisEkrani();
            }
        }
        girisEkrani();
    }

    public static void market() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");
        System.out.println("Lutfen alacaginiz urun kodunu giriniz\n71-Muz - 60₺\n72-Patates - 25₺\n73-Elma - 49₺\n74-Sogan - 20₺\n75-Domates - 39₺\n76-Ananas - 59₺");
        while (!ekUrun){
            urunKodu = scan.nextInt();
            if (urunKodu>=71&&urunKodu<=76){
                System.out.println("Kac kg alacaksiniz?");
                urunMiktari= scan.nextInt();
                switch (urunKodu){
                    case 71:
                        urunAdi="Muz";
                        urunFiyati=60;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 72:
                        urunAdi= "Patates";
                        urunFiyati=25;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 73:
                        urunAdi= "Elma";
                        urunFiyati=49;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 74:
                        urunAdi= "Sogan";
                        urunFiyati=20;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 75:
                        urunAdi= "Domates";
                        urunFiyati=39;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 76:
                        urunAdi= "Ananas";
                        urunFiyati=59;
                        System.out.println(urunMiktari+ " kg"+urunAdi+" fiyati"+urunFiyati*urunMiktari+" TL'dir");
                        break;

                }
                urunFiyati=urunFiyati*urunMiktari;
                toplam+=urunFiyati;
                System.out.println("Olusan sepet tutari: "+toplam);
                sepet+=urunAdi+" : "+urunFiyati+" TL \n";
                System.out.println("Baska urun almak isterseniz kodunu giriniz. Ana menuye donmek icin 0 tusuna basiniz");
            }else if (urunKodu==0);
                girisEkrani();
        }
        girisEkrani();
    }

    public static void fisYazdir() {
        System.out.println("================= T120 - WISE MARKET =================");
        System.out.println("=====    Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz     ======");
        System.out.println("----------      Alışveriş Bilgileriniz         -------------");
        System.out.println(" \n \n");
        System.out.println("Alışveriş Listeniz\n"+sepet);
        System.out.println(" ");
        System.out.println("Toplam Tutar: "+toplam);
        System.out.println(" \n \n");
        System.out.println("------------      İyi Günler Dileriz         --------------");
        LocalDateTime saat=LocalDateTime.now();
        System.out.println(saat);
        System.out.println("Ana menuye donmek icin 0 tusuna basiniz. Cikis yapmak icin 5 tusuna basiniz");
        if (urunKodu==0){
            girisEkrani();
        }else if (urunKodu==5){
            cikis();
        }
        cikis();
    }

    public static void cikis() {
         //scan.close();
        System.exit(0); // calisan java kodunu durdurur
    }


}
