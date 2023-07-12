package ders15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin
        while loop kullanarak verilen sayinin istenen ussunu hesaplayin yazdiran
        bir method olusturun.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scn.nextInt();
        System.out.println("Lutfen sayinin hesaplamak istediginiz ussunu giriniz ");
        int ust = scn.nextInt();
        ustHesaplama(sayi,ust);


    }

    public static void ustHesaplama (int sayi, int ust){
        int a = 1;
        int sonuc = 1;
        while (ust>0){
            sonuc*=sayi;
            ust--;
        }
        System.out.println(sonuc);
    }


}
