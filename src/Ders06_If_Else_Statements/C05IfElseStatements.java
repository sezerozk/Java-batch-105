package Ders06_If_Else_Statements;

import java.util.Scanner;

public class C05IfElseStatements {
    public static void main(String[] args) {
        /*
        SORU Kullanicidan yasini alip 65 yas ve uzeri ise emekli olablirsin
        yazdirin yoksa emekli olmasi icin calismazi gereken sureyi yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (yas>=65){
            System.out.println("Yasiniz emekli olmak icin yeterlidir");
        } else{
            System.out.println("emekli olmak icin" + (65-yas) + "sene daha calismalisiniz");
        }



    }


}
