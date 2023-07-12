package ders10_stringManupulation;

public class C03_startsWith {
    public static void main(String[] args) {
        /*
        Bir string in baska bir string ile baslayip baslamadigini kontrol eder ve
        boolean sonuc dondorur
         */
        String str = "manti acarken java ogrenilmez";
        System.out.println(str.startsWith("Manti"));//false
        System.out.println(str.startsWith("manti"));//true
        System.out.println(str.startsWith("acarken", 6));//true
        //startsWith in ikinci kullanilinda bir indeks veriyoruz ve verdigimiz
        //indeksin verdigimiz icerikle baslayip baslamadigini kontrol ediyoruz



    }
}
