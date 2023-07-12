package ders07_NestedIfElseStatetemnts;

import java.util.Scanner;

public class C01_IfElseIfStattements {
    public static void main(String[] args) {
        /*
        SORU Kullanicidan boyunu "cm olarak" ve kilosunu
        alarak vucut kitle endeksini hesaplayin "(kilo*10000)/(boy*boy)"
        endeks 30 dan buyukse obez
        25-30 arasi ise kililu
        20-25 arasi ise normal
        20 den kucukse zayif yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        int boy = scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        double vke = ((kilo*10000)/(boy*boy));
        System.out.println("vucut kitle endeksiniz "+(vke));

        if (vke>=30){
            System.out.println("obez");
        }else if (vke<30 && vke>25) {
            System.out.println("kilolu");
        }else if (vke<=25 && vke>20) {
            System.out.println("normal");
        }else if (vke>0) {
            System.out.println("zayif");
        }else {
            System.out.println("Yanlis giris");
        }


    }


}
