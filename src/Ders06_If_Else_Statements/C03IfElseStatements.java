package Ders06_If_Else_Statements;

import java.util.Scanner;

public class C03IfElseStatements {
    public static void main(String[] args) {


         /*
        SORU Klullanicidan bir ucgenin uc kenar uzunlugunu alin
        ve ucgen eskenar ise eskenar ucgen yazdirin degilse eskenar degildir yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a==b && a==c ){
            System.out.println("Verileri girilen ucgen eskenardir.");
        } else{
            System.out.println("Verileri girilen ucgen eskenar degildir");
        }

    }


}
