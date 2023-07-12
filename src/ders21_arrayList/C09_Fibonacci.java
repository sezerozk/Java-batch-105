package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {


    public static void main(String[] args) {

    //Soru; Kullanicidan pozitif bir tam sayi alip
    // o sayidan kucuk fibonacci sayilarini yazdirin.
        List<Integer> fibonacci = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        Integer sayi = sc.nextInt();
        Integer sayi1 = 0;
        Integer sayi2 = 1;
        Integer sayi3 = 0;
        while (sayi>sayi3){
            sayi3=sayi1+sayi2;
            sayi2 = sayi1;
            sayi1 = sayi3;
            if (sayi3<sayi){
                fibonacci.add(sayi3);
            }
        }
        System.out.println(fibonacci);
    }
}
