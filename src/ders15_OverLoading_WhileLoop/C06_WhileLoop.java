package ders15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    /*
    Kullanicidan sifre isteyip sasgidaki sartlari saglamayan sifrelerde hatalari yazdirip,
    kullanicinin yeni sifre girmesini isteyin. Gecerli bir sifre yazilincaya degin bu
    islemi tekrar ettirin. Gecerli sifre yazilinca sifreniz basari ile kaydedildi
    yazdirin. sartlar
    1- sifrenin ilk karakteri kucuk harf olmali
    2- sifrenin son karakteri rakam olmali
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean sifreOK = true;
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre ="";
        int bayrak = 0;
       while (sifreOK){

           sifre = scn.nextLine();
           char ilkKarakter = sifre.charAt(0);
           char sonKarakter = sifre.charAt(sifre.length()-1);
           bayrak=0;
           if (ilkKarakter<'a' || ilkKarakter>'z'){
               System.out.println("Sifrenin ilk hqrfi kucuk harf olmalidir" +
                       "lutfen tekrar giriniz");
               bayrak++;
           }
           if (sonKarakter<'0' || sonKarakter>'9') {
               System.out.println("Sifrenin son karakteri rakam olmalidir"
                                    +"lutfen tekrar giriniz");
               bayrak++;
           }
           if (bayrak==0){
               System.out.println("Sifreniz basari ile kaydedildi");
               sifreOK = false;
           }


       }



    }




}
