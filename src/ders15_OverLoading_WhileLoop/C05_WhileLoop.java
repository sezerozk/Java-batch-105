package ders15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan toplanmak uzere sayi alin
        sayilarin toplami 500'e esit olur ya da gecerse

        girilen sayi adedi ile sayilarin toplami ile
        "Bu kadar yeterli" yazdirin.
         */

        Scanner scn = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;
        while (toplam<500){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scn.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami: " + toplam
                            +"\n bu kadar yeterli");


    }
}
