package ders02_data_turleri_ve_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenin iki kenar uzunlugunu alarak dikdortgenin alaninini hesaolayin.
        Scanner scan= new Scanner(System.in);
        System.out.println("dikdortgenin uzun kenar uwunlugunu giriniz");
        int uzunKenar= scan.nextInt();
        System.out.println("dikdortgenin kisa kenar uwunlugunu giriniz");
        int kisaKenar= scan.nextInt();
        System.out.println("alan= "+(uzunKenar*kisaKenar));




    }



}
