package ders09_stringManupulations;

public class C06_Substring {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";
        System.out.println(str.substring(5));//Verilen indeksten sonrasini yazdirir
        int a = str.length();
        System.out.println(a);
        //Son karakteri String olarak kaydedin.
        String str1 = str.substring(str.length()-1);
        str1 =""+ str.charAt(str.length()-1);//Burada son karakter char olarak verildigi icin ""+
        // yaparak char olan ifadeyi String e donusturmus olduk.
        System.out.println(str1);
        System.out.println(str1.toUpperCase());
        // Son uc harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(str.length()-3).toUpperCase());




    }


}
