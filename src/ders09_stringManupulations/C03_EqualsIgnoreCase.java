package ders09_stringManupulations;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

        System.out.println(str1.equalsIgnoreCase(str3));

        //Bu method ile buyuk kucuk harf duyarliligi ortadan kalkiyor
        System.out.println(str1.equalsIgnoreCase("ali "));



    }


}
