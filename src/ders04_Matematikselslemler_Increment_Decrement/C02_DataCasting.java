package ders04_Matematikselslemler_Increment_Decrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan iki double sayi alin ilk sayiyi ikinci sayiya bolun
        ve sonucun tam sayi kismini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("ondalikli bir sayi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("ilk girdiginiz sayidan farkli bir ondalikli sayi giriniz");
        double sayi2 = scan.nextDouble();
        int sayi3 = (int)(sayi1/sayi2);
        System.out.println(sayi3);



    }



}
