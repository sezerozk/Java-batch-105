package Ders06_If_Else_Statements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        SORU Kullanicidan ucgenin kenar uwunlukjlarini alin kenar uwunluklari
        0 veya negatifse gecersiz kenar uzunlugu yazdirin
        kenar uzunluklari esitse eskenar ucgen yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        int ken1 = scan.nextInt();
        int ken2 = scan.nextInt();
        int ken3 = scan.nextInt();

        if (ken1 == ken2 && ken1 == ken3){
            System.out.println("eskenar ucgen");
        } else if (ken1<=0 || ken2<=0 || ken3<=0 ) {
            System.out.println("gecersiz giris");
        }else {
            System.out.println("eskenar ucgen degil");
        }
        /*
        Ornekteki gibi else-if kullanimlarinda seceneklerden gecerli olan sadece birisinegore
        islem yapilir digerleri gormezden gelinir.
         */


    }


}
