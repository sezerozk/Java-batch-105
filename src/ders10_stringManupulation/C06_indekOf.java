package ders10_stringManupulation;

public class C06_indekOf {
    public static void main(String[] args) {

        /*
        Bir String icerisinde aradigimiz bir string veya char degerin ilk kullanim
        indeksini dondurur.
        2 parametre kullanirsak aramaya hangi indeksten baslayacagini soyleyebiliriz
         */
        String str = "Ahmet hoca ile her sey clear";
        System.out.println(str.indexOf("a"));//9
        System.out.println(str.indexOf('c'));//8
        System.out.println(str.indexOf("her sey"));//blok halinde girilen ifadelerde ilk
        //karakterin indeksini veriyor
        System.out.println(str.indexOf("e", 14));
        //cumledeki ikinci c nin indeksini yazdirin
        int sayi = str.indexOf("c");
        System.out.println(str.indexOf("c", (sayi + 1)));
        System.out.println(str.indexOf("ali"));//-1, Java arananin metin icersinde olmadigini
        //anlatmak icin eger aranan yoksa sonucu -1 olarak dondurur.


    }
}
