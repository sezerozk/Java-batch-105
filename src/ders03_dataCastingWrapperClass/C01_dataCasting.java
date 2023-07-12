package ders03_dataCastingWrapperClass;

public class C01_dataCasting {
    public static void main(String[] args) {
        /*
        her data turu birbirine cevrilemez.
        Bazi data turleri ise Java tarafindan otomatik olaak cevrilir.
         */
       /*
        String str = 20;
        boolean mutluMu = "true";
        int a = true;
        burada bulunan degiskenler yorum olmaktan cikarildiginda Java nin bu degiskenlerin birbirinin yerine kullanilmsaini
        kabul etmedigi ve hata verdigi gorulur.
        */
        double s= 20;
        int sayi = 15;
        long ln = sayi; //ornegin burada iki farkli data turu long ve int
                        //esitleniyor ve fakat Java buna itiraz etmiyor.
    short sh = 23;
    int a = sh;
    long lng = sh;
    /*
    dar data turunden bir degeri genis data turundeki bir variable a atama yapilirsa Java kabul ediliyor.
    Kova ornegi akla gelirse daha iyi anlasilir.
     */

    }


}
