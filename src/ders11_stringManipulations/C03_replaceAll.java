package ders11_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str = "J1ava2 G9uzel5dir8";
        //str'deki sayilari silip "Java Guzeldir" haline getirelim
        /*
        str = str.replace("1", "");
        str = str.replace("2", "");
        str = str.replace("9", "");
        str = str.replace("5", "");
        str = str.replace("8", "");
        System.out.println(str);
         */
        //str.replaceAll() sadece bir harf ya da char sequence' degil
        //genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir
        /*
        Regex(Regular Expressions)
        \\s: space     \\S:space olmayan her sey
        \\s+: yan yana birden fazla space
        \\d : digits    \\D : digit olmayan her sey
        \\w : harf veya rakam    \\W : harf veya rakam olmayan her sey
         */
        System.out.println(str.replaceAll("\\d", ""));
        String s1 = "ilk urun fiyati 1250 tl";
        String s2 = "ikinci urunun fiyati 1500 tl";
        //iki urunun fiyatini toplayin

        s1=s1.replaceAll("\\D","");
        s2 = s2.replaceAll("\\D","");
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

    }
}
