package ders14_methodOlusturma;

public class C06_SubstringOlusturma {
    /*
    SORU1- Kullanicidan input olarak verilen bir String alip baslangic ve bitis
    indekslerine gore baslangic indeksi dahil bitis indeksi haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    -Kullanici baslangic degeri olarak bitis degerinden daha buyuk bir deger
    girerse hata mesaji verin
    -Kullanici str'da olan indekslerden daha buyuk bir indekls girerse hata mesaji
    yazdirin.
     */

    public static void main(String[] args) {
    String str = "Java ne kadar guzel";
    int baslangicIndeksi = 5;
    int bitisIndeksi = 13;
    substringOlusturma(str,baslangicIndeksi,bitisIndeksi);
    substringOlusturma("da guzel",0,8);
    substringOlusturma("java",6,8);

    }
    public static void substringOlusturma(String str, int baslangicIndeksi, int bitisIndeksi){
        if (baslangicIndeksi>bitisIndeksi){
            System.out.println("Hatali giris yaptiniz");
        } else if (baslangicIndeksi>str.length()||bitisIndeksi>str.length()) {
            System.out.println("Hatali giris yaptiniz");
        }
        String str1 = "";
        for (int i = baslangicIndeksi; i < bitisIndeksi ; i++) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);

    }



}
