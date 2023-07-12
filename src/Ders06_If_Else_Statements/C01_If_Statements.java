package Ders06_If_Else_Statements;

import java.sql.Wrapper;
import java.util.Scanner;

public class C01_If_Statements {
    public static void main(String[] args) {
        /*
        SORU. Kullanicidan bir harf alin ve harf ile baslayan bir ay
        varsa yazdirin. Kullanici o veya O (kucuk ya da buyuk harf kullandiginda)
        output Ocak olsun
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char ch = scan.next().charAt(0);//Kullanicidan ilk harf alma yolu
        if (ch=='o' || ch=='O'){
            System.out.println("Ocak");
        }

        if (ch=='s' || ch=='S'){
            System.out.println("Subat");
        }

        if (ch=='m' || ch=='M'){
            System.out.println("Mart veya Mayis");
        }





    }


}
