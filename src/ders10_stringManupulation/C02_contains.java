package ders10_stringManupulation;

public class C02_contains {
    public static void main(String[] args) {
        String str = "Java ile kodlamak cok zevkli";
        /*
        contains methodu bir string ifadenin icinde belirtieln karakter dizisinin
        var olup olmadigini kontrol eder ve boolean bir sonuc dondurur
         */

        System.out.println(str.contains("cok"));
        System.out.println(str.contains(" ile k"));
        System.out.println(str.contains("java"));//false
        String str2 = "Java";
        System.out.println(str.contains(str2));//true



    }
}
