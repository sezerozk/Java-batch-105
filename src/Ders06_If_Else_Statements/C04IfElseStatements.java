package Ders06_If_Else_Statements;

import java.util.Scanner;

public class C04IfElseStatements {
    public static void main(String[] args) {

        /*
        SORU Kullanicidan bir karakter girmesini isteyin ve
        girilen karakterin buyuk harf olup olmadigini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch = scan.next().charAt(0);


        /*
        Bunu yapabilmek icin karakterlerin ASCII tablosundaki
        degerlerinden yararlaniyoruz.
        UNUTULMAMALI! Eger karakterler matematiksel islemlerde
        kullanilirsa Java karakterlerin ASCII degerleini dikkate alir.
         */
        if (ch>='A' && ch<='Z'){
            System.out.println("Girilen karakter buyuk harftir");
        } else{
            System.out.println("Girilen karakter buyuk harf degildir");
        }

    }


}
