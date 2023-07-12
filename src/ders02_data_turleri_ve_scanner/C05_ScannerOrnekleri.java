package ders02_data_turleri_ve_scanner;

import java.util.Scanner;

public class C05_ScannerOrnekleri {
    public static void main(String[] args) {

        /*
        Kullanicidan bir double ve bir integer sayi alip bunlarin çarpimini yazdirin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("vorgullu sayi giriniz");
        double virgulluSayi= scan.nextDouble();
        System.out.println(virgulluSayi);
        System.out.println("yasinizi giriniz");
        int tamSayi= scan.nextInt();
        System.out.println("girilen sayilarin çarpimi= " +virgulluSayi*tamSayi);

    }

}
