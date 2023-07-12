package ders03_dataCastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        /*
        char olarak girilebilecek butun karakterlerin ascii tablosuna gore matematiksel bir
        karsiligi vardir ve Java tarafindna bazi durumlarda bu matematiksel
        deger dikkate alinarak islem yapilir. Yukaridaki ornekte a 97 ye b 98 e karsilik
        geldiginden islem sonucunu 195 olrak hesapladi.
         */
        // KULLANICIDAN CHAR BIR KARAKTER ALIN VE O KARAKTERDEN SONRA
        // GELEN UC KARAKTERI YAZDIRIN
        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char karakter = scan.next().charAt(0);
        char sonuc1 = (char)(karakter+1);
        char sonuc2 = (char)(karakter+2);
        char sonuc3 = (char)(karakter+3);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        //HOCANIN YONTEMI
        Scanner scan1 = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char girilenkrk = scan1.next().charAt(0);
        System.out.println(""+(char)(girilenkrk+1) + (char)(girilenkrk+2) + (char)(girilenkrk+3));
        /*
        Burada en basa string ifadesi olan "" ekledik boylece Java nin gordugu elementlerle
        dogrudan matematik islemi yapmasini onledik. Ardindan girilen karakterin data turunu char olarak
        degistirebilmek icin yaninan (char) ifadesini ekledik aksi takdirde karakterleri degil
        karakterlerin ascii tablosundaki matematiksel karsiliklarini gorurduk
         */





    }

}
