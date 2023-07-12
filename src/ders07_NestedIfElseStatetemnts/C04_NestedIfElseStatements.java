package ders07_NestedIfElseStatetemnts;

import java.util.Scanner;

public class C04_NestedIfElseStatements {

    public static void main(String[] args) {

        /*
        SORU: Kullanicidan yasini ve cinsiyetini kadin icin 60 yas ve uweri
        erkek icin 65 yas ve uuzeri emekli olabilir bilgisinden hareketle
        "emekli olabilirsin" ya da "ekekli olmak icin .... yil daha calisman gerek" yazdirin
         */

       Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Lutfen cinsiyetinizi giriniz E/K");
        char cinsiyet = scan.next().charAt(0);

        if (yas<15){
            System.out.println("Hatatli yas girisi");
        } else if (yas<60) {
            if (cinsiyet=='K'){
                System.out.println("Emekli olmak icin " + (60-yas)+ "yil daha calismalisin");
            } else if (cinsiyet=='E') {
                System.out.println("Emekli olmak icin " + (65-yas)+ "yil daha calismalisin");
            }

        } else if(yas<65){
           if (cinsiyet=='K'){
               System.out.println("Emekli olabilirsin");
           } else if (cinsiyet=='E') {
               System.out.println("Emekli olmak icin " + (65-yas)+ "yil daha calismalisin");
           }
        }else{
            System.out.println("Emekli olabilirsin");
        }




    }


}
