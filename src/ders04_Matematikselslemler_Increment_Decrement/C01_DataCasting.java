package ders04_Matematikselslemler_Increment_Decrement;

public class C01_DataCasting {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 5;
        System.out.println(sayi1/sayi2);//4
        int sayi3 = 20;
        int sayi4 = 6;
        System.out.println(sayi3/sayi4);
        /*
        Normalde sonucun 3.333333 seklinde olmasi gerekir fakat Java bome isleminde
        bolen ve bolunenin tam sayi oldugu durumlarda sonucu da tam sayi olarak gosterir.
        Yani sonuc 3 olarak gorunur.
         */
        double sayi5 = 6;
        System.out.println(sayi1/sayi5); // Burada int/double yapiyoruw. Java daha genis olan
                                         // double a gore hareket eder ve virgulden sonraki kisli da yazdirir
                                         // ve sonuc 3.33333(15 adet) seklinde yazdirilir.



    }


}
