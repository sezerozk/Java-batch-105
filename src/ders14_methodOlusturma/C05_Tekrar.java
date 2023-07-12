package ders14_methodOlusturma;

public class C05_Tekrar {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(C01_carpim.carpimMethodu(a, b));//200,0

        String c = "Nasil";
        String d = "yani";
        System.out.println(C02_stringConcate.stringBirlestirme(c, d));

        String e = "Bu da mi oldu";
        //e String'ini tersten yazdirin
        System.out.println(C04_TerseCevirmeCharAt.terseCevirme1(e));


        //"Bu cumleyi terse cevirin"
        System.out.println(C04_TerseCevirmeCharAt.terseCevirme1("Bu cumleyi terse cevirin"));
        System.out.println(C03_StringTerseCevirme.terseCevirme("Bu cumleyi terse cevirin"));


    }
}
