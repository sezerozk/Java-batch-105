package ders16_DoWhileLoopScope;

import java.util.Scanner;

public class C05_DoWhile {
    public static void main(String[] args) {
    /*
    Kullanicidan pozitif bir tam sayi isteyin ve sayinin tam kare olup olmadigini bulun.
    Tam kara ise true degilse false yazdirin.
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = sc.nextInt();
        int bayrak=0 ;
        boolean sonuc = true;
        for (int i = 1; i <sayi ; i++) {
            bayrak=0;
            if (i*i==sayi){
                bayrak++;
                break;
            }

        }
        if (bayrak==0){
            sonuc = false;
        }else {
            sonuc = true;
        }
        System.out.println(sonuc);
        sc.close();

    }
}
