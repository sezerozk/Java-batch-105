package ders12_forLoop;

public class C03_rakamlarToplami {
    public static void main(String[] args) {
    //Kullanicinin verdigi sayinin rakamlar toplamini bulun
        int sayi = 1453;
        int birlerbasamagi = 0;
        int rakamlartoplami = 0;
        String strsayi = ""+sayi;
        int a = strsayi.length();
        for (int i = 0; i <=a ; i++) {
            birlerbasamagi = sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlartoplami);

    }
}
