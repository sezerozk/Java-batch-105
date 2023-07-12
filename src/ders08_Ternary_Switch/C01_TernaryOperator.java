package ders08_Ternary_Switch;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {
        /*
        Ternary if-else statements ile yapabiliecegimiz basit islemleri
        daha basit bir sekilde yapma imkani tanir.
         */
        //SORU Kullanicidan bir sayi alin sayi pozitifse 2 ile carpin
        //degilse 10 ekleyerek yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();


       /*
        if (sayi>0){
            System.out.println(sayi*2);
        }else {
            System.out.println(sayi+10);
        }
        */

        System.out.println(sayi>0 ? (sayi*2) : (sayi+10));




    }


}
