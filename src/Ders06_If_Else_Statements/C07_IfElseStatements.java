package Ders06_If_Else_Statements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin girilen harf kuçuk harf ise onu buyuk harf olarak yazdirin
        yoksa girilen harfi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char a = scan.next().charAt(0);

        if (a>='a' && a<='z'){
            System.out.println((char)(a-32));
        } else{
            System.out.println(a);
        }


    }



}
