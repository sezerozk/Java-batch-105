package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_carpim {
//Main method icerisinde kullanicidan iki sayi alin
//bu iki sayiyi parametre olarak kabul edip carpimlarini
//bize donduren bir method olusturun

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scn.nextDouble();
        double sayi2 = scn.nextDouble();
        carpimMethodu(sayi1,sayi2);//calisir fakat ekranda sonuc yazdirmaz
        System.out.println(carpimMethodu(4,8));//calisir ve ekranda sonucu yazdirir
        /*
        Ayrica bu kod calistiginda konsolda iki kere "carpim methodu calisti" yazdirilir
        cunku method iki kere cagirilmis oldu.
         */

    }

    public static double carpimMethodu (double sayi1,double sayi2){
        System.out.println("carpim methodu calisti");
        return sayi1*sayi2;
    }



}

