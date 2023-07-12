package ders15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
    /*
    Kullanicidan toplanmak uwere tam sayilar alin
    kullanici 0'a basarsa sayi alma islemini bitirin
    ve kullanicinin kac sayi girdigini ile bu sayilarin toplamini yazdirin
     */
        Scanner scn = new Scanner(System.in);
        int a =1;
        int b = 0;
        int toplam = 0;
        while (a!=0){
            System.out.println("Lutfen bir sayi giriniz ve" +
                    "\n bitirmek icin 0'a basin");
            a = scn.nextInt();
            if (a!=0){
                toplam +=a;
                b++;
            }
        }
        System.out.println(b + " adet sayi girdiniz");
        System.out.println("Girdiginiz sayilarin toplai: "+  toplam);
        scn.close();
    }
}
