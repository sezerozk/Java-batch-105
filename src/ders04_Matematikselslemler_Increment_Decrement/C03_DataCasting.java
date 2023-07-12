package ders04_Matematikselslemler_Increment_Decrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        /*
        SORU Kullanicidan iki int deger alip bunlarin bolme sonucunu double olarak yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki adet tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        double sayi3 = (double)(sayi1/sayi2);
        /*
        Bu sekilde casting yapildiginda sonuc degismiyor. Cunku Java islem onceligi geregi
        once parantez icindeki iki int sayi bolup sonucu tam sayi olarak buluyor
        ve sonrasinda doubla a casting yapilsa da sonuc 3 ise 3.0 olarak yazdiriyor.
        Bunu asabilmek icin int olan sayilardan en az birisinin doubla a cast edilmesi gerek.
         */
        System.out.println(sayi3);
        double sayi4 = (double)sayi1/sayi2;
        System.out.println(sayi4);//1.5384615384615385




    }



}
