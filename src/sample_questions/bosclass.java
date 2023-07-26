package sample_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bosclass {

    public static void main(String[] args) {

        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        //int sayi = scan.nextInt();
//
        //int girilenSayi = sayi;
        //int birlerBasamagi = 0;
        //int toplam = 0;
//
        //int rakamSayisi = (girilenSayi+"").length();
//
        //for (int i = 1; i <= rakamSayisi ; i++) {
//
        //    birlerBasamagi = sayi % 10;
        //    toplam += birlerBasamagi;
        //    sayi = sayi/10;
//
        //}
        //System.out.println("Girilen sayinin rakamlar toplami :"+toplam);

        /*
            Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
            input1 : “15.30 €” , input2 : “11.40 €”
            output : 26.70 €
         */

          /*
            Verilen bir int array’in tum elemanlarini
            2 artirip bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.
         */

        //int[] arr = {3,4,6,8,1,4,7,3,2};
//
        //for (int i = 0; i < arr.length; i++) {
//
        //    arr[i] +=2;
        //}
//
//
        //int[] yeniArr = arr;
        //System.out.println(Arrays.toString(yeniArr));


        //int[] arr = {3,5,2,7};
        //int artis = 3;
//
        //// verilen array'in tum elementlerini
        //// artis miktari kadar artirin
//
//
        //for (int i = 0; i < arr.length; i++) {
//
        //    arr[i] += artis;
        //}
//
        //System.out.println(Arrays.toString(arr));

        // Verilen bir array’deki
        // pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

       //int[] arr = {-4,5,2,0,-3, 5};  // beklenen output : pozitif elementlerin toplami 12

       //nt toplam = 0;

       //for (int i = 0; i < arr.length; i++) {

       //    if (arr[i]>0){

       //        toplam += arr[i];
       //    }
       //}

       //System.out.println(toplam);


        // Verilen bir array’de istenen bir elemanin
        // var olup olmadigini ve varsa kac kere kullanildigini yazdiran kod yazin

        //int[] arr = {3,5,2,3,5,6,7,1,8};
        //int arananSayi = 6;
//
        //int sayac = 0;
//
        //for (int i = 0; i < arr.length; i++) {
//
        //    if (arr[i]==arananSayi){
//
        //        sayac++;
        //    }
        //}
//
        //if (sayac==0){
        //    System.out.println("Aranan sayi array'de hic kullanilmamis");
        //}else{
        //    System.out.println("Aranan "+arananSayi+" sayisi array'de "+sayac+ " kere kullanilmis");
        //}

        //Kullanicidan array’in boyutunu ve elementlerini
        // alip array’i olusturan ve bize donduren bir method olusturun.

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Lutfen array'in uzunlugunu giriniz");
        //int uzunluk = scanner.nextInt();
//
        //int[] arr = new int [uzunluk];
//
        //for (int i = 0; i < arr.length; i++) {
//
        //    scanner= new Scanner(System.in);
        //    System.out.println("Lutfen array'in elementlerini giriniz");
//
        //    arr[i] = scanner.nextInt();
//
        //}
//
        //System.out.println(Arrays.toString(arr));

        //int[] arr = {2,4,6,8};
//
        //System.out.println("Eski array : "+ Arrays.toString(arr));  //eski array: {2,4,6,8}
        //arr= C02_ArrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr,4);
        //System.out.println("Yeni array : "+ Arrays.toString(arr));  //yeni array: {6,8,10,12}
//
        //System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr));
//
        //C04_ElementSay.elemanSay(arr,6);
//
        //int[] kullaniciArrayi = C05_ArrayOlustur.arrayOlustur();
        //System.out.println(Arrays.toString(kullaniciArrayi));


        //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.


        //String[] isimler = {"Resul","Omer","Mehmet","Ertugrul"};
//
//
        //String enkisaKelime = isimler[0];
        //String enuzunKelime = isimler[0];
//
        //for (int i = 0; i < isimler.length; i++) {
//
        //    if (isimler[i].length()>enuzunKelime.length()){
        //        enuzunKelime = isimler[i];
        //    }
        //    if (isimler[i].length()<enkisaKelime.length()){
        //        enkisaKelime = isimler[i];
        //    }
//
        //}
//
        //System.out.println("En uzun isim : "+enuzunKelime);
        //System.out.println("En kisa isim : "+enkisaKelime);

        //String[] isimler = {"Ayse","Yusuf","Bugra","Abdullah","Nergiz","Gulay","Ramazan"};

        // verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin

      //int sayac = 0;
      //int kelimeUzunlugu = 0;
//
      //  for (int i = 0; i < isimler.length; i++) {
//
      //      kelimeUzunlugu = isimler[i].length();
//
      //      if (kelimeUzunlugu % 2 !=0){
//
      //          System.out.print(isimler[i]+ " ");
      //          sayac++;
      //      }
//
      //  }
//
      //  System.out.println("\nToplam "+sayac+" adet isim yazdirildi");

        //int[] arr = {0,13,4,7,10,2,1,23};
//
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));  //[0, 1, 2, 4, 7, 10, 13, 23]
//
        //System.out.println(Arrays.binarySearch(arr,0)); //0
        //System.out.println(Arrays.binarySearch(arr,4)); //3
        //System.out.println(Arrays.binarySearch(arr,1));//1
        //System.out.println(Arrays.binarySearch(arr,23));//7
        //System.out.println(Arrays.binarySearch(arr,13));//6

        // verilen bir array'in uzunlugunu bir artırarak
        // verilen bir elementi ekleyin

        //int[] arr = {3,7,8};
        //int eklenecekSayi = 10;
//
        //int[] yeniArr = new int[4];
//
        //for (int i = 0; i < arr.length; i++) {
//
        //    yeniArr[i] = arr[i];
        //}
//
        //yeniArr[yeniArr.length-1] = eklenecekSayi;
//
        //arr = yeniArr;
//
        //System.out.println("arr'nin yeni hali : "+Arrays.toString(arr));

        //double hiz = 100;
        //double kmYol = 50;
        //
//
        //System.out.println(sample_question18.gidilenYereVarisSuresi(hiz,kmYol));

        // verilen bir array'in uzunlugunu bir artırarak
        // verilen bir elementi ekleyin

        /*int[] arr = {3,7,8};
        int eklenecekSayi = 10;

        int[] yeniArr = new int[4];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        }

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        arr = yeniArr;

        System.out.println(Arrays.toString(arr));

         */

       //int[] arr = {2,4,1,6};
//
       //arr = arrayeElemanEkle(arr,100);
//
       //System.out.println(Arrays.toString(arr));

        //int[] arrTek = {3,7,1,9};
        //// Bu array'in tum elementlerini toplayin
//
        //int toplam = 0;
//
        //for (int i = 0; i < arrTek.length; i++) {
//
        //    toplam += arrTek[i];
//
        //}
//
        //System.out.println("Array'deki elementlerin toplami : "+toplam);

        //int [][]  sayilar = {{1, 2, 5}, {7, 4}, {9}, {3, 0, 1}};
//
        //for (int i = 0; i < sayilar.length; i++) {
//
        //    for (int j = 0; j < sayilar[i].length; j++) {
//
        //        toplam += sayilar[i][j];
        //    }
//
        //}
//
        //System.out.println("Sayilar array'indeki elementlerin toplami : "+toplam);

        //int[][] arr = {{3, 6, 8,} ,{2, 5, 9,}, {1, 3,} ,{12, 23, 34}};
//
        //// verilen array'deki tek sayilari
        //// aralarinda bir bosluk birakarak yanyana yazdirin
        //// en sonda da "toplam... sayi yazdirildi" seklinde aciklama yazdirin
//
        //int toplam = 0;
        //int sayac = 0;
//
        //for (int i = 0; i < arr.length; i++) {
//
        //    for (int j = 0; j < arr[i].length; j++) {
//
        //        if (arr[i][j] % 2 == 1){
//
        //            System.out.print(arr[i][j] + " ");
        //            sayac++;
        //        }
        //    }
//
        //}
//
        //System.out.println("\nToplam "+sayac+ " sayi yazdirildi");

        // verilen 2 katli int bir array'deki
        // en buyuk ve en kucuk sayiyi yazdiran bir method olusturun

        //int[][] arr = {{3, 6, 8,} ,{2, 5, 9,}, {1, 3,} ,{12, 23, 34}};
//
        //enKucukenBuyukYazdirma(arr);

         /*
            Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
            yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.

            input : int[][] arr = {{3,4,5}, {2,3,6,7}}; output: [5, 7, 11]
         */

        //int[][] arr = {{3,4,5}, {2,3,6,7}};
//
        //int uzunluk = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;
//
        //int [] yeniArr = new int[uzunluk];
//
        //for (int i = 0; i < yeniArr.length; i++) {
//
        //    yeniArr[i] = arr[0][i] + arr[1][i];
//
        //}
//
        //System.out.println(Arrays.toString(yeniArr));


        //int[][] sayilar = {{3, 4, 5,} ,{1, 4,} ,{5, 2, 7,}, {1, 9, 0, 3},{4}};
//
        //sonElementleriYazdir(sayilar);

        // verilen bir int array'de, tekrar eden elementleri silin
        // array'i unique degerlerden olusan haline donusturun

        int[] arr = {2,4,5,3,2,5,1,5,3,7};

        // [2,4,5,3,1,7]

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (! tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);
            }

        }
        System.out.println(tekrarsizList);

        System.out.println(Arrays.toString(arr));

        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        System.out.println(Arrays.toString(arr));



    }

    /*
            Soru 5- Verilen 2 katli bir array’de
            her bir inner array’in son elementlerinin toplaminini yazdiran bir method olusturun.
         */


    /*public static void sonElementleriYazdir (int[][] sayilar ){

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i][sayilar[i].length-1];

        }

        System.out.println("Sayilar array'inin elementleri toplami : "+toplam);

     */


    }





