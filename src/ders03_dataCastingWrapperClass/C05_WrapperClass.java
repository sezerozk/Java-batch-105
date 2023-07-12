package ders03_dataCastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi = 10;
        String str = "Java ço guzel.";

        /*
        Primitive data turleri sadece deger barindirirlar, hazir methodlari yoktur.
        Fakat Java primitive data turleri ile bazi methodlarin kullanilabilmesi icin
        Wrapper Class lar olusturmustur.
         */
        char krk = 'a';
        Character krkWrapper='a';
        System.out.println(Character.isLetterOrDigit('^'));

        String str1 = "123";
        String str2 = "12";
        System.out.println(str1 + str2);
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
        /*
        Burada ilk ihtimalde string oldugu icin matematik islemi olmaksizin 12312 sonucunu
        gorduk ancak parseInt wrapper class i ile string olan datayi integer a cevirdik ve toplama
        islemi yaptirabildik. Fakat girilen degerler icerisinde bir tane bile rakam disi
        karakter olsaydi Java hata verecekti.
         */



    }

}
