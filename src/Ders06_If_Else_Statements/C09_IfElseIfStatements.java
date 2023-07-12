package Ders06_If_Else_Statements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        SORU Kullanicidan bir tam sayi alin
        sayi negatif ise gecersiz
        tek basamakli ise rakam
        iki basamakli ise iki basamakli
        digerleri icin buyuk sayi yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int a = scan.nextInt();
        if (a<0){
            System.out.println("Gecersiz giris" );
        } else if (a>=0 && a<=9) {
            System.out.println("rakam");
        } else if (a>=10 && a<=99) {
            System.out.println("iki basamakli sayi");
        } else{
            System.out.println("Buyuk sayi");
        }


    }


}
