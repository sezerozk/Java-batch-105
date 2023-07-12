package ders13_NestedForLoopVeMethotOlusturma;

import java.util.Scanner;

public class C08_methodOlusturma {
    public static void main(String[] args) {
    //Kullanicidan iki sayi alip bunlarin toplamini yazdiran bir method oluqturun

       toplama();
       toplama();//method iki kere cagrilirsa iki kere calisir



    }
    public static void toplama (){
        Scanner scn = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1 = scn.nextInt();
        int sayi2 = scn.nextInt();
        System.out.println("Girilen sayilarin toplami: " + (sayi1+sayi2));
    }



}
