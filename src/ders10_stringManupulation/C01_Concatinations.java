package ders10_stringManupulation;

public class C01_Concatinations {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Guzeldir";
        boolean bl = true;
        int sayi = 20;
        double dbl = 3.54;
        System.out.println(str1 + bl + sayi);//String kendisi ile isleme giren diger data
        //turlerini string lestirir.
        String str3 = str1.concat(" ").concat(str2);
        //concat() methodu sadece string variable lari birlestirmek için kullanilir
        System.out.println(str3);




    }
}
