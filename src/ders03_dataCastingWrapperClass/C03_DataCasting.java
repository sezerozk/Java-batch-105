package ders03_dataCastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tam sayi alarak kullanici hangi
        rakami girerse girsin sonucun -128 ile 127 araliginda olmaszini
        saglayacak bir kod yazin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int a = scan.nextInt();
        byte byt = (byte)a;
        System.out.println(byt);




    }

}
