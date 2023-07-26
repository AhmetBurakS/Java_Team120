package EXERCİSE;

import java.util.Locale;
import java.util.Scanner;

public class C04_exercise_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       //System.out.println("Lutfen kilonuzu giriniz");
       //double kilo = scan.nextDouble();
       //System.out.println("Lutfen boyunuzu giriniz");
       //double boy = scan.nextDouble();
       //double vke = kilo*10000 / (boy * boy);
       //
       //if (vke>=30){
       //    System.out.println("Obez");
       //}else if (vke>=25){
       //    System.out.println("kilolu");
       //}else if (vke>=20){
       //    System.out.println("Normal");
       //}else{
       //    System.out.println("zayif");
       //}

       //System.out.println("Lutfen cinsiyetinizi giriniz Erkek: 'E' , Kadin: 'K' ");
       //char cinsiyet = scan.next().toUpperCase().charAt(0);
       //System.out.println("Lutfen yasinizi giriniz");
       //double yas = scan.nextDouble();

       //if (cinsiyet == 'E'&& yas>=65) {
       //    System.out.println("Erkek emekli olabilir");
       //}else if (cinsiyet=='E'&& yas<65){
       //    System.out.println("Erkek emekli olamaz: Emekli olmak icin "+ (65-yas) + "yil daha calismalidir" );
       //}else if (cinsiyet=='K' && yas>=60){
       //    System.out.println("Kadin emekli olabilir");
       //}else if (cinsiyet=='K' && yas<60){
       //    System.out.println("Kadin emekli olamaz: Emekli olmak icin "+ (60-yas) + "yil daha calismalidir");
       //}


       //System.out.println("Lutfen cinsiyetinizi giriniz");
       //char cinsiyet= scan.next().toUpperCase().charAt(0);
       //System.out.println("Lutfen yasinizi giriniz");
       //double yas = scan.nextDouble();

       //if (cinsiyet=='E'){

       //    if (yas<0 || yas>100){
       //        System.out.println("Gecersiz yas girisi");
       //    }else if (yas>=65){
       //        System.out.println("Erkek emekli olabilir");
       //    }else if (yas<65){
       //        System.out.println("Erkek emekli olamaz: Emekli olmak icin "+ (65-yas) + "yil daha calismalidir");
       //    }


       //}else if (cinsiyet=='K'){

       //    if (yas<10 || yas>80){
       //        System.out.println("Gecersiz yas girisi");
       //    }else if (yas>=60){
       //        System.out.println("Kadin emekli olabilir");
       //    }else if (yas<60){
       //        System.out.println("Kadin emekli olamaz: Emekli olmak icin "+ (60-yas) + "yil daha calismalidir");
       //    }


       //}else{
       //    System.out.println("Gecersiz cinsiyet girisi");
       //}


       //System.out.println("Lutfen cinsiyetinizi giriniz");
       //char cinsiyet = scan.next().toUpperCase().charAt(0);
       //System.out.println("Lutfen yasinizi giriniz");
       //double yas= scan.nextDouble();

       //if (cinsiyet=='K'){

       //    if (yas<0 || yas>90){
       //        System.out.println("Gecersiz yas girisi");
       //    }else if (yas>=60){
       //        System.out.println("Kadin emekli olabilir");
       //    }else if (yas<60){
       //        System.out.println("Kadin emekli olamaz: Emekli olmak icin "+ (60-yas) + "yil daha calismalidir");
       //    }


       //}else if (cinsiyet=='E'){

       //    if (yas<0 || yas>90){
       //        System.out.println("Gecersiz yas girisi");
       //    }else if (yas>=65){
       //        System.out.println("Erkek emekli olabilir");
       //    }else if (yas<65){
       //        System.out.println("Erkek emekli olamaz: Emekli olmak icin "+ (65-yas) + "yil daha calismalidir");
       //    }



       //}else{
       //    System.out.println("Gecersiz cinsiyet girisi");
       //}

       //System.out.println("Lutfen urun adedini giriniz");
       //int urunAdedi = scan.nextInt();
       //System.out.println("Lutfen liste fiyatini giriniz");
       //double listeFiyati = scan.nextDouble();
       //System.out.println("Musteri kartiniz var mi?\n E: Evet H: Hayir");
       //char kart = scan.next().toUpperCase().charAt(0);


       //if (kart== 'E'){

       //    if (urunAdedi>10){
       //        System.out.println("%20 indirimli toplam fiyat: "+ urunAdedi*listeFiyati*80/100);
       //    }else if (urunAdedi<10)
       //        System.out.println("%15 indirimli toplam fiyat: "+ urunAdedi*listeFiyati*85/100);

       //}else if (kart== 'H'){

       //    if (urunAdedi>10){
       //        System.out.println("%15 indirimli toplam fiyat: "+ urunAdedi*listeFiyati*85/100);
       //    }else if (urunAdedi<10)
       //        System.out.println("%10 indirimli toplam fiyat: "+ urunAdedi*listeFiyati*90/100);


       //}else{
       //    System.out.println("Gecersiz kart bilgisi");
       //}

       //System.out.println("Lutfen pozitif bir tamsayi giriniz");
       //int sayi= scan.nextInt();

       //if (sayi%2 ==0){
       //    System.out.println("Cift sayi");
       //}else{
       //    System.out.println("Tek sayi");
       //}

       //System.out.println(sayi%2 ==0 ? "Cift sayi" : "Tek sayi" );

       //int input = 30;

       //System.out.println(input%3==0 ? "3'e tam bolunur" : "3'e tam bolunmez");

       //System.out.println(input%2==0 ? "Cift sayi" : "2*input");

       //System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
       //double kenar1= scan.nextDouble();
       //double kenar2= scan.nextDouble();
       //double kenar3= scan.nextDouble();

       //System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ?
       //                    "Eskenar ucgen" : "Eskenar degil");


       //System.out.println("Lutfen 2 tane sayi giriniz");
       //double sayi1= scan.nextDouble();
       //double sayi2= scan.nextDouble();

       //System.out.println(sayi1>sayi2 ? sayi2 : sayi1);

       //System.out.println("Lutfen bir sayi giriniz");
       //double sayi= scan.nextDouble();

       //System.out.println(sayi>0 ? sayi : (-1*sayi));

       // System.out.println("Lutfen ay numarasini giriniz");
       // int ayNo = scan.nextInt();


       //if (ayNo==1) System.out.println("Ocak");
       //else if (ayNo==2) System.out.println("Şubat");
       //else if (ayNo==3) System.out.println("Mart");
       //else if (ayNo==4) System.out.println("Nisan");
       //else if (ayNo==5) System.out.println("Mayis");
       //else if (ayNo==6) System.out.println("Haziran");
       //else if (ayNo==7) System.out.println("Temmuz");
       //else if (ayNo==8) System.out.println("Agustos");
       //else if (ayNo==9) System.out.println("Eylul");
       //else if (ayNo==10) System.out.println("Ekim");
       //else if (ayNo==11) System.out.println("Kasim");
       //else if (ayNo==12) System.out.println("Aralik");
       //else System.out.println("Gecersiz Ay Numarasi Girisi");

       //switch (ayNo){
       //    case 1:
       //        System.out.println("Ocak");
       //        break;
       //    case 2:
       //        System.out.println("Subat");
       //        break;
       //    case 3:
       //        System.out.println("Mart");
       //        break;
       //    case 4:
       //        System.out.println("Nisan");
       //        break;
       //    case 5:
       //        System.out.println("Mayis");
       //        break;
       //    case 6:
       //        System.out.println("Haziran");
       //        break;
       //    case 7:
       //        System.out.println("Temmuz");
       //        break;
       //    case 8:
       //        System.out.println("Agustos");
       //        break;
       //    case 9:
       //        System.out.println("Eylul");
       //        break;
       //    case 10:
       //        System.out.println("Ekim");
       //        break;
       //    case 11:
       //        System.out.println("Kasim");
       //        break;
       //    case 12:
       //        System.out.println("Aralik");
       //        break;
       //    default:
       //        System.out.println("Gcersiz Ay Numarasi Girisi");
       //}


        //System.out.println("Lutfen anlamini girmek istediginiz harfi giriniz");
        //char harf= scan.next().toUpperCase().charAt(0);
//
        //switch (harf){
//
        //    case 'I':
        //        System.out.println("International");
        //        break;
        //    case 'S':
        //        System.out.println("Software");
        //        break;
        //    case 'T':
        //        System.out.println("Testing");
        //        break;
        //    case 'Q':
        //        System.out.println("Qualifiqation");
        //        break;
        //    case 'B':
        //        System.out.println("Board");
        //        break;
        //    default:
        //        System.out.println("Gecersiz harf girisi");
        //}

        //System.out.println("Lutfen gun numarasini giriniz");
        //int gunNo= scan.nextInt();
//
        //switch (gunNo){
        //    case 1:
        //    case 2:
        //    case 3:
        //    case 4:
        //    case 5:
        //        System.out.println("Haftaici");
        //        break;
//
        //    case 6:
        //    case 7:
        //        System.out.println("Haftasonu");
        //        break;
//
        //    default:
        //        System.out.println("Gecersiz Gun Numarasi Girisi");
        //}

        //String str = "Java Candir";
//
        //System.out.println(str.charAt(0));
//
        //System.out.println(str.toUpperCase());
//
        //str = str.toLowerCase();
        //System.out.println(str);
        //System.out.println(str.toLowerCase(Locale.forLanguageTag("İng")));

        //String str1= "Mehmet";
        //String str2= "MEHMET";
        //String str3= "mehmet";
        //String str4= "MEHmet";
//
        //System.out.println(str1.equals(str2));                //false
        //System.out.println(str3.equals(str4.toLowerCase()));  //true
        //System.out.println(str2.equals(str3.toUpperCase()));  //true
        //System.out.println(str3.equals(str1.toLowerCase()));  //true
//
        //System.out.println(str1.equalsIgnoreCase(str2));       //true
        //System.out.println(str2.equalsIgnoreCase(str3));       //true
        //System.out.println(str3.equalsIgnoreCase(str4));       //true

        //String str= "Java Candir";
//
        //System.out.println(str.charAt(10));
        //System.out.println(str.charAt(2));
        //System.out.println(str.charAt(11-5));
        //System.out.println(str.toUpperCase().charAt(3));

        //String str = "Ramazan Uzunkavaklaraltindayataruyumazoglu";
//
        //System.out.println("Isım uzunlugu: "+ str.length());
//
        //System.out.println("Son harf: "+ str.charAt(str.length()-1));
//
        //System.out.println("sondan 5. harf: "+str.charAt(str.length()-5));

        //System.out.println("Lutfen isminizi giriniz");
        //String girilenIsim = scan.nextLine();
        //int uzunluk = girilenIsim.length();
//
        //if (uzunluk % 2==0 ){
        //    System.out.println("İsmin uzunlugu cift sayi, ortadaki 2 harf: "
        //                        + girilenIsim.charAt(girilenIsim.charAt(uzunluk/2-1) + girilenIsim.charAt(uzunluk/2)));
//
        //}else{
        //    System.out.println("Ismin uzunlugu tek sayi,ortadaki harf: "+girilenIsim.charAt(uzunluk/2));
        //}

        //String str = "Java Candir";
//
        //System.out.println(str.substring(5));
        //System.out.println(str.substring(0));
//
        //System.out.println(str.substring(1,11));
        //System.out.println(str.substring(7,11));
//
        ////6. index'teki harfi buyuk harf olarak yazdirin
        //System.out.println(str.substring(6,7).toUpperCase());
//
        //System.out.println(str.substring(3,3));
//
        //System.out.println(str.substring(str.length()-3));

        //String str1 = "Java";
        //String str2 = " ";
        //String str3 = "Candir";
//
        //System.out.println(str1+str2+str3);
//
        //System.out.println(str1.concat(str2).concat(str3));

        //String str = "Java Candir";

        //System.out.println(str.contains("r"));
        //System.out.println(str.contains("z"));
        //System.out.println(str.contains(""));

        //System.out.println(str.startsWith("Java"));
        //System.out.println(str.startsWith(""));
        //System.out.println(str.startsWith("java Candir"));
        //System.out.println(str.startsWith("i",9));
        //System.out.println(str.startsWith("ir",9));

        //System.out.println(str.endsWith("candir"));
        //System.out.println(str.endsWith("ndir"));
        //System.out.println(str.endsWith(" "));
        //System.out.println(str.endsWith("i"));

        //System.out.println("Lutfen mail adresinizi girin");
        //String mail = scan.nextLine();
//
        //if (! mail.contains("@")){
        //    System.out.println("Gecersiz mail");
        //}else if (! mail.contains("gmail.com")){
        //    System.out.println("Mail gmail olmali");
        //}else if (! mail.endsWith("gmail.com")){
        //    System.out.println("mailde yazim hatasi var");
        //}

        //String str = "Ali topu at, at ali at";
//
        //System.out.println(str.indexOf(",")); //11
        //System.out.println(str.indexOf("at")); //9
        //System.out.println(str.indexOf("Ali")); //0
        //System.out.println(str.indexOf(" ",6)); //8
        //System.out.println(str.indexOf("Veli")); //-1

        //String str = "Ali topu at, topu at ali";

        // ilk top metin parcasinin index'ini yazdirin
        //System.out.println(str.indexOf("top"));  //4

        //ikinci top metin parcasinin index'ini yazdir
        //System.out.println(str.indexOf("top",5)); //13


        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun

        //int ilkIndex = str.indexOf("at");
//
        //if (ilkIndex == -1){
        //    System.out.println("2 kere kullanilmamis");
        //}else{
//
        //    int ikinciIndex = str.indexOf("at",ilkIndex+1);
//
        //    if (ikinciIndex == -1){
        //        System.out.println("2 defa kullanilmamis");
        //    }else{
        //        System.out.println("2 veya daha fazla kullanilmis");
        //    }
        //
        //}

        //int ilkIndex = str.indexOf("at");
//
        //if (ilkIndex==-1){
        //    System.out.println("2 defa kullanilmamis");
        //}else{
//
        //    int ikinciIndex = str.indexOf("at",str.indexOf(ilkIndex+1));
//
        //    if (ikinciIndex==-1){
        //        System.out.println("2 defa kullanilmamis");
        //    }else{
        //        System.out.println("2 veya daha fazla kullanilmis");
        //    }
//
        //}

        //---------------------------------------------------------------------------------------------
        /*Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        yazdirin.*/


        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Lutfen bir metin giriniz");
        //String str=scanner.nextLine();
        //int uzunluk=str.length();
//
        ////mehmet
//
        //if (uzunluk%2==0){
        //    System.out.println(str.substring(0,str.length()/2)+":)"+str.substring(str.length()/2));
//
//
        //}else {
        //    System.out.println(str.substring(0,str.length()/2)+":("+str.substring(str.length()/2+1));
//
        //}

          /*Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
            - ismi daha uzun ise, isim ve soyismi "ilk harf buyuk kalanlar kucuk seklinde"
            yazdirin
            - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
            harflerle yazdirin.*/

        //Scanner scanner = new Scanner(System.in);
//
        //System.out.print("İsim: ");
        //String isim = scanner.nextLine();
//
        //System.out.print("Soyisim: ");
        //String soyisim = scanner.nextLine();
//
        //if (isim.length() > soyisim.length()) {
        //    System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() +
        //            " " + soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).toLowerCase());
        //} else {
        //    System.out.println( isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase()+" " +
        //            soyisim.toUpperCase());
        //}

        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €
         */

                //String input1 = "15.30 €";
                //String input2 = "11.40 €";
//
                //// İlk fiyatı alırken € sembolünü ve boşluk karakterlerini kaldırıyoruz
                //double price1 = Double.parseDouble(input1.replace("€", "").trim());
//
                //// İkinci fiyatı alırken € sembolünü ve boşluk karakterlerini kaldırıyoruz
                //double price2 = Double.parseDouble(input2.replace("€", "").trim());
//
                //// Fiyatları topluyoruz
                //double total = price1 + price2;
//
                //// Sonucu istenen çıktı formatında yazdırıyoruz
                //System.out.printf("%.2f €%n", total);

            /*
            Soru 1 : Kullanicidan bir cumle alin
            - cumlede ev geciyorsa, "home home sweet home" yazdirin - cumlede is geciyorsa, "calismak guzeldir"
            - ikisini de iceriyorsa "Hem ev lazim hem is"
            - hicbirini icermiyorsa "cok calisman lazim" yazdirin
             */

        //System.out.println("Lutfen bir cumle yaziniz");
        //String cumle = scan.nextLine().toLowerCase();
//
        //if (cumle.contains("ev")&& cumle.contains("is")){
        //    System.out.println("Hem ev lazim hem is");
        //}else if (cumle.contains("ev")){
        //    System.out.println("home home sweet home");
        //}else if (cumle.contains("is")){
        //    System.out.println("calismak guzeldir");
        //}else{
        //    System.out.println("cok calisman lazim");
        //}

        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        input : java1 ogRe2@nMek3 #ne +Gu=zel output : Java ogrenmek ne guzel.
         */


        //System.out.println("Lütfen bir metin giriniz.");
        //String girilenmetin = scan.nextLine();
//
        //String ilkharfBuyuk = girilenmetin.substring(0,1).toUpperCase() + girilenmetin.substring(1).toLowerCase();
//
        //ilkharfBuyuk= ilkharfBuyuk.replaceAll("\\d","");
        //ilkharfBuyuk= ilkharfBuyuk.replaceAll(" ","1");
        //ilkharfBuyuk= ilkharfBuyuk.replaceAll("\\W","");
        //ilkharfBuyuk= ilkharfBuyuk.replaceAll("1"," ");
//
//
        //System.out.println(ilkharfBuyuk + ".");

        /*
            Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
            kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
            "sifre basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
         */


        //System.out.print("Şifre giriniz: ");
        //String password = scan.nextLine();
//
        //boolean isFirstCharLowercase = Character.isLowerCase(password.charAt(0));
        //boolean isLastCharDigit = Character.isDigit(password.charAt(password.length() - 1));
        //boolean containsSpace = password.contains(" ");
        //boolean isLengthValid = password.length() >= 10;
//
        //if (!isFirstCharLowercase) {
        //    System.out.println("İlk harf küçük harf olmalıdır.");
        //}
        //if (!isLastCharDigit) {
        //    System.out.println("Son karakter rakam olmalıdır.");
        //}
        //if (containsSpace) {
        //    System.out.println("Şifre boşluk içermemelidir.");
        //}
        //if (!isLengthValid) {
        //    System.out.println("Şifre en az 10 karakterden oluşmalıdır.");
        //}
//
        //if (isFirstCharLowercase && isLastCharDigit && !containsSpace && isLengthValid) {
        //    System.out.println("Şifre başarıyla kaydedildi.");
        //}

        //System.out.println("Lutfen sifre giriniz");
        //String sifre= scan.nextLine();
        //
        //
        //boolean sart1 = Character.isLowerCase(sifre.charAt(0));
        //boolean sart2 = Character.isDigit(sifre.charAt(sifre.length()-1));
        //boolean sart3 = sifre.contains(" ");
        //boolean sart4 = sifre.length()>=10;
//
        //if (!sart1){
        //    System.out.println("ilk harf kucuk harf olmali");
        //}
        //if (!sart2){
        //    System.out.println("son karakter rakam olmali");
        //}
        //if (sart3){
        //    System.out.println("sifre bosluk icermemeli");
        //}
        //if (!sart4){
        //    System.out.println("uzunlugu en az 10 karakter olmali");
        //}
//
        //if (sart1 && sart2 && !sart3 && sart4){
        //    System.out.println("Sifreniz basariyla kaydedildi");
        //}

        //String str = "Javayi ogrenecegiz, baska yolu yok";
        //
        //int ilkIndex = str.indexOf();
        //int sonIndex = str.lastIndexOf();
        //
        //if (ilkIndex == -1){
        //    System.out.println("Hic kullanilmamis");
        //}else if (ilkIndex==sonIndex){
        //    System.out.println("Sadece 1 kere kullanilmis");
        //}else {
        //    System.out.println("2 kere veya daha fazla kullanilmis");
        //}

        //String str = "1Ja4va 8C9a2n5d1i1r.";
//
        //str = str.replaceAll("\\d","");
        //System.out.println(str);

        //kullanicidan bir metin isteyin
        //metindeki tum sayilari ve space disindaki ozel karakterleri temizleyin
        //metnin sonuna da . koyun
        //ornek input: "J1*2av4.a C67/an=+dir--_"
        //      output: "Java Candir."

        //System.out.println("Lutfen bir metin giriniz");
        //String metin = scan.nextLine();
//
        //metin = metin.replaceAll("\\d", "");
        //metin = metin.replaceAll("\\s","1");
        //metin = metin.replaceAll("\\W","");
        //metin = metin.replaceAll("1"," ");
        //metin = metin.replaceAll("_","");
        //metin = metin + ".";
        //System.out.println(metin);

        //int input = 20;
//
        //for (int i = input; i <=100 ; i+=5) {
        //    System.out.print(i+" ");
        //}
        //System.out.println("");
//
        //for (int i = 100; i >= 1 ; i--) {
        //    if (i % 7==0){
        //        System.out.print(i + " ");
        //    }
        //}

        // kullanicinin verdigi baslangic ve bitis degerleri dahil olarak
        // bu sayilarin arasinda aranan sayiya tam bolunebilen bir sayi varsa
        // "aranan sayi ile tam bolunebilen bir sayi var yazdirin
        //int baslangic = 201;
        //int bitis = 237;
//
        //int arananSayi = 43;
//
        //for (int i = baslangic; i <=bitis ; i++) {
        //    System.out.println(i);
//
        //    if (i % arananSayi ==0 ){
        //        System.out.println("aranan sayi ile tam bolunebilen bir sayi var");
        //        break;
        //    }
        //}

         /*
            Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
            kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
            "sifre basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
         */
//
        //System.out.println("Lutfen sifrenizi giriniz");
        //String sifre = scan.nextLine();
//
        //boolean flag = true;
//
        //char ilkHarf = sifre.charAt(0);
//
        //if (!(ilkHarf>='a' && ilkHarf<='z')){
        //    System.out.println("ilk harf kucuk harf olmali");
        //}  flag = false;
//
        //char sonKarakter = sifre.charAt(sifre.length()-1);
//
        //if (!(sonKarakter>='0' && sonKarakter<='9')){
        //    System.out.println("son karakter rakam olmali");
        //} flag = false;
//
//
        //if (sifre.contains(" ")){
        //    System.out.println("sifre bosluk icermemeli");
        //} flag = false;
//
//
        //if (!(sifre.length() >= 10)){
        //    System.out.println("uzunlugu en az 10 karakter olmali");
        //} flag = false;
//
        //if (flag){
        //    System.out.println("Sifre basarili sekilde kaydedildi");
        //}

        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
        kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
                "sifre basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
                - son karakter rakam olmali
                - sifre bosluk icermemeli
                - uzunlugu en az 10 karakter olmali
         */

        //System.out.println("Lutfen sifrenizi giriniz");
        //String sifre = scan.nextLine();
//
        //boolean flag = true;
//
        //char ilkHarf = sifre.charAt(0);
//
        //if (!(ilkHarf>='a' && ilkHarf<='z')){
        //    System.out.println("ilk harf kucuk harf olmali");
        //    flag=false;
        //}
//
//
//
        //char sonKarakter = sifre.charAt(sifre.length()-1);
//
        //if (!(sonKarakter>='0' && sonKarakter<='9')){
        //    System.out.println("son karakter rakam olmali");
        //    flag=false;
        //}
//
        //if (sifre.contains(" ")){
        //    System.out.println("sifre bosluk icermemeli");
        //    flag=false;
        //}
//
        //if (!(sifre.length()>=10)){
        //    System.out.println("uzunlugu en az 10 karakter olmali");
        //    flag=false;
        //}
//
        //if (flag){
        //    System.out.println("Sifre basariyla kaydedildi");
        //}

        /*
            Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
             sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
              Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        //System.out.println("Lutfen baslangic degeri olarak pozitif bir tamsayi giriniz");
        //int baslangic = scan.nextInt();
//
        //System.out.println("Lutfen bitis degeri olarak pozitif bir tamsayi giriniz");
        //int bitis = scan.nextInt();
//
        //if (bitis<baslangic){
        //    System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
        //}else{
//
        //    int toplam = 0;
//
        //    for (int i = baslangic; i <=bitis ; i++) {
//
        //        toplam += i;
//
        //    }
        //    System.out.println("sinirlar dahil olarak aralarindaki tum sayilarin toplami : "+ toplam);
        //}

        /*
            Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
             sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
             Bitis degeri baslangic degerinden kucuk olsa da program calissin
         */


        //System.out.println("Lutfen baslangic degeri icin pozitif bir tamsayi giriniz");
        //int baslangic = scanner.nextInt();
//
        //System.out.println("Lutfen bitis degeri icin pozitif bir tamsayi giriniz");
        //int bitis= scanner.nextInt();
//
//
        //int toplam = 0;
//
        //if (bitis<baslangic){
//
        //    for (int i = baslangic; i <=bitis ; i++) {
        //        toplam += i;
        //    }
//
//
        //}else{
//
        //    for (int i = bitis; i <= baslangic; i++) {
        //        toplam += i;
        //    }
        //    System.out.println("sinirlar dahil olarak aralarindaki tum sayilarin toplami : "+ toplam);
        //}

        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
         */

        //System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi giriniz");
        //int sayi = scan.nextInt();
//
        //int carpim = 1;
//
        //for (int i = 1; i <=sayi ; i++) {
        //    carpim *=i;
//
        //}
//
        //System.out.println("Girilen sayi "+ sayi+ "! :" + carpim);

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        //System.out.println("Lutfen pozitif bir tamsayi giriniz");
        //int girilenSayi = scan.nextInt();
//
        //int sayi = girilenSayi;
        //int birlerBasamagi = 0;
        //int rakamlarToplami = 0;
//
        //int basamakSayisi = (sayi + "").length();
//
        //for (int i = 1; i <=basamakSayisi ; i++) {
//
        //    birlerBasamagi = sayi % 10;
        //    rakamlarToplami += birlerBasamagi;
        //    sayi /= 10;
//
        //}
//
        //System.out.println("Girilen " + girilenSayi + "sayisinin rakamlar toplami: " + rakamlarToplami);

          /*
        Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
        */

        //System.out.println("Lutfen pozitif bir tamsayi giriniz");
        //int sayi = scan.nextInt();
//
        //for (int i = 1; i <=sayi ; i++) {
//
        //    if (i%3==0 && i%5==0){
        //        System.out.print("fizzbuzz\n ");
        //    }else if (i%3==0){
        //        System.out.print("fizz ");
        //    }else if (i%5==0){
        //        System.out.print("buzz ");
        //    }else {
        //        System.out.print(i+" ");
        //    }
//
//
        //}

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        //System.out.println("Lutfen tersini yazdirmak istediginiz metni giriniz");
        //String metin = scan.nextLine();
//
        //for (int i = metin.length()-1; i >=0 ; i--) {
        //    System.out.print(metin.charAt(i));
        //}
        //System.out.println("");
//
        //String tersMetin = "";
//
        //for (int i = metin.length()-1; i >=0 ; i--) {
        //    tersMetin += metin.charAt(i);
//
        //}
//
        //System.out.println("Terse cevrilen metin : "+tersMetin);

        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

       // System.out.println("Lutfen pozitif bir tamsayi giriniz");
       // int sayi = scan.nextInt();
//
       // boolean flag = true;
//
       // for (int i = 2; i < sayi; i++) {
//
       //     if (sayi % i==0){
       //         System.out.println("Asal sayi degil");
       //         flag= false;
       //         break;
       //     }
//
       // }
       // if (flag)
       //     System.out.println("Asal sayi");

        /*
            Asagidaki tabloyu konsolda yazdirin

            1  2  3  4
            2  4  6  8
            3  6  9  12

            // eger yazdirilacak sekil dikdortgen bicimindeyse
                icice forLoop seklinde yapabiliriz
         */

        //for (int i = 1; i <=4 ; i++) {
        //    System.out.print(i*1 + "  ");
        //}
        //System.out.println("");
        //for (int i = 1; i <=4 ; i++) {
        //    System.out.print(i*2 + "  ");
        //}
        //System.out.println("");
        //for (int i = 1; i <=4 ; i++) {
        //    System.out.print(i*3 + "  ");
        //}
        //System.out.println("=============");
//
        //for (int j = 1; j <=3 ; j++) {
//
        //    for (int i = 1; i <=4 ; i++) {
        //        System.out.print(i*j + "  ");
        //    }
        //    System.out.println("");
        //}

        /*
            Kullaniicdan 2 rakam alin
            ilk rakam satir
            ikinci rakam sütun olmak uzere asagidaki sekli cizdirin

            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
         */

        //System.out.println("Olusturulacak seklin satir sayisini giriniz");
        //int satir = scan.nextInt();
//
        //System.out.println("Olusturulacak seklin sutun sayisini giriniz");
        //int sutun = scan.nextInt();
//
        //for (int i = 1; i <=satir ; i++) {
//
        //    for (int j = 1; j <=sutun ; j++) {
//
        //        System.out.print("*  ");
        //    }
        //    System.out.println("");
        //}

         /*
            1               1.satir 1'den 1'e kadar yazdir
            1  2            2.satir 1'den 2'e kadar yazdir
            1  2  3         3.satir 1'den 3'e kadar yazdir
            1  2  3  4      4.satir 1'den 4'e kadar yazdir

         */

        //for (int i = 1; i <=4 ; i++) {
//
        //    for (int j = 1; j <=i ; j++) {
//
        //        System.out.print(j + " ");
        //    }
        //    System.out.println("");
        //}

        /*

           Kullanicidan satir sayisi olarak bir rakam alin ve
           asagidaki gibi bir sekil cizdirin

           *
           *  *
           *  *  *
           *  *  *  *
           *  *  *  *  *

         */

        //System.out.println("Lutfen satir sayisini giriniz");
        //int satir = scan.nextInt();
//
//
        //for (int i = 1; i <=5 ; i++) {
//
        //    for (int j = 0; j <=i ; j++) {
//
        //        System.out.print("*  ");
//
        //    }
        //    System.out.println("");
        //}

        //int satir = 5;
        //int sutun = 7;
//
//
        ////dikdotgen bicimde, satir ve sutun numaralarini yazdiralim
//
        //for (int i = 1; i <=satir ; i++) {
//
        //    for (int j = 1; j <=sutun ; j++) {
//
        //        System.out.print(i + "," + j + "  ");
        //    }
        //    System.out.println("");
        //}
//
        ////ucgen icin satir ve sutun numaralarini yazdiralim
//
        //for (int i = 1; i <=satir ; i++) {
//
        //    for (int j = 0; j <=i ; j++) {
        //        System.out.print(i + "," + j + "  ");
        //    }
        //    System.out.println("");
        //}

        /*
       1,2,3,4,5,6,7,8,9            3,6,9

       A- 1,2,3,4,5,6,7,8,9        1,4,7
       B- 3,4,5,6,7,8,9             3,6,9
       C- 1,2,3,4,5,6,7,8,9,10      3,6,9
       D- 1,0,-1,-2
         */

         /*
            Soru 4- Kullanicidan main method icinde bir tamsayi alin.
            Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
            // ornek: 20 pozitif tam bolenleri: 1,2,4,5,10,20 ptbs : 6
         */

       /* System.out.println("Lutfen tam bolenleri sayisini bulmak istediginiz sayiyi giriniz");
        int sayi = scan.nextInt();

        System.out.println(tamBolen(sayi));


    }

    public static int tamBolen(int sayi){

        int sayac = 0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i ==0){
                sayac++;
            }

        }
        return sayac;

        */


        /*      Kullanicidan main method icinde pozitif bir tamsayi alin.
                Girilen sayinin asal sayi olup olmadigini kontrol edip,
                sonuc olarak "true" veya "false"
                sonuclarini donduren bir method olusturun.
        */

       /* System.out.println("Lutfen asal sayi kontrolü icin pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(asalSayiMi(sayi));


    }

    public static boolean asalSayiMi (int sayi){

        boolean flag = true;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i ==0){

                flag = false;
                break;

            }

        }

        if (flag){
            return true;

        }else{
            return false;
        }
        \*
        */

        // 1'den 100'e kadar olan sayilari (sinirlar dahil)
        // for loop ile hesaplayin


        //int toplam = 0;
//
        //for (int i = 1; i <=100 ; i++) {
//
        //    toplam += i;
        //}
//
        //System.out.println("for Loop ile toplam : "+ toplam);
//
        //int toplam =0;
//
        //int i = 1;
//
        //while (i<=100){
//
        //    toplam += i;
//
        //    i++;
//
//
        //}
//
        //System.out.println("while Loop ile toplam : "+ toplam);

        /*
            Soru 4 : Main method'da kullanicidan bir sifre isteyip,
            olusturacagimiz bir method'da asagidaki sartlari kontrol edin
            ve method'dan true veya false dondurun

            kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
            tum sartlar saglanincaya kadar tekrar deger isteyin
            ve sartlar saglaninca
            "sifre basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
         */

        //System.out.println("Lutfen sifrenizi giriniz");
        //String sifre = scan.nextLine();
//
        //System.out.println(sifreKontrolu(sifre));


    }

    //public static boolean sifreKontrolu(String sifre){

        //int sayac = 0;
//
        //char ilkHarf = sifre.charAt(0);
        //if (!(ilkHarf>='a' && ilkHarf<='z')){
        //    System.out.println("ilk harf kucuk harf olmali");
        //    sayac++;
        //}
//
        //char sonKarakter = sifre.charAt(sifre.length()-1);
        //if (!(sonKarakter>='0' && sonKarakter<='9')){
        //    System.out.println("son karakter rakam olmali");
        //    sayac++;
        //}
//
        //if (sifre.contains(" ")){
        //    System.out.println("sifre bosluk icermemeli");
        //    sayac++;
        //}
//
        //if (!(sifre.length()<10)){
        //    System.out.println("uzunlugu en az 10 karakter olmali");
        //    sayac++;
        //}
//
        //return sayac == 0;

     //}

    // Kullanicidan toplanmak uzere sayilari alin
    // girilen sayilarin toplami 500'u gecerse
    // bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
    // girilen sayi adedi 10 veya daha yuksek olursa
    // 10'san fazla giremezsin, girilen sayilarin toplami .... oldu yazdirin
    // ve islemi bitirin





}
