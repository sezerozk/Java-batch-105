package ders07_NestedIfElseStatetemnts;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan yasini ve cinsiyetini kadin icin 60 yas ve uweri
        erkek icin 65 yas ve uuzeri emekli olabilir bilgisinden hareketle
        "emekli olabilirsin" ya da "ekekli olmak icin .... yil daha calisman gerek" yazdirin
         */
        /*nested"ic ice"if else statements de degiskenlerden bir tanesi
        ana degisken olarak secilir
         */
        char cinsiyet = 'k';
        int yas = 66;
        if (cinsiyet=='k' || cinsiyet=='K'){
            if (yas>15 && yas<60){
                System.out.println("emekli olmak icin " + (60-yas)+"yil daha calismalisin");
            } else if (yas>=60) {
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("Hatali giris");
            }
        } else if (cinsiyet=='e' || cinsiyet=='E') {
            if (yas>15){
                System.out.println("emekli olmak icin " + (65-yas)+"yil daha calismalisin");
            } else if (yas>60) {
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("Hatali giris");
            }

        }else{
            System.out.println("hatali giris");
        }


    }


}
