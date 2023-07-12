package ders05_Concatenation_ve_Operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin
        // Eger birinci sayi 100 den buyukse birinci sayi 100 den buyuk yazdirin
        // eger ikinci sayi ciftse ikinci sayi cift yazdirin
        // eger ilk sayi ikinci sayidan buyukse ilk sayi daha buyuk yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int b = scan.nextInt();
        if (a>100){
            System.out.println("Birinci sayi 100 den buyuk");}

       if (b%2==0){
           System.out.println("Ikinci sayi cift");
       }

        if (b>a);
        System.out.println("Ikinci sayi birinci sayidan buyuk");
        /*
        Basit if cumleleri kodun geriye kalanindan bagimsizdir.
        Onemli olna if den sonra boolean bir ifade olmasidir. Bu boolean ifade
        onceden de tanimlanabilir.
         */





    }


}
