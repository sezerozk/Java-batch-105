package ders16_DoWhileLoopScope;

import java.util.Scanner;

public class C03_SifreKOntrolu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edip ve sifredeki hatalari yazdirin. Kullanici gecerli bir sifre girinceye kadar
        bu islemi tekrar edin.
        -Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir
         */
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int b = 0;
        int c = 0;
        int cikisSarti = 0;
        String sifre = "";
        do {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scn.nextLine();
            kucukHarfKontrolu(sifre);
            buyukHarfKontrolu(sifre);
            ozelKarakterKontrolu(sifre);
            if (sifre.length()>+8){
                cikisSarti++;
            }else {
                System.out.println("Sifre en az 8 karakter olmalidir");
            }

            System.out.println("cikisDarti= " + cikisSarti);
            System.out.println("x= " + x);
            System.out.println("b= " + b);
            System.out.println("c= " + c);

        }while (x+b+c+cikisSarti!=4);


        System.out.println(cikisSarti);
        System.out.println("Sifre basari ile kaydedildi");

    }

    public static int kucukHarfKontrolu (String sifre) {
        int x = 0;
        for (int a = 0; a < sifre.length(); a++) {
            if (sifre.charAt(a) >= 'a' && sifre.charAt(a) <= 'z') {
                x++;
                break;
            }
            if (x == 0) {
                System.out.println("Sifre kucuk harf icermelidir");
            }

        }
        return x;
    }
    public static int buyukHarfKontrolu (String sifre){
            int b = 0;
            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                    b++;
                    break;
                }
            }
            if (b == 0) {
                System.out.println("Sifre buyuk harf icermelidir");
            }
            return b;
    }

    public static int ozelKarakterKontrolu (String sifre){
            int c = 0;
            for (int j = 0; j < sifre.length(); c++) {
                if (sifre.charAt(j) >= ' ' && sifre.charAt(j) <= '.') {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                System.out.println("Sifre ozel karakter icermelidir");
            }
            return c;
        }
    }