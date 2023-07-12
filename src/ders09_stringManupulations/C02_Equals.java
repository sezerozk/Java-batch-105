package ders09_stringManupulations;

public class C02_Equals {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ali";
        String str3 = new String("Ali");
        String str4 = "Ali";

        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true
        /*
        String ifadelerinin iceriklerinin ayni olup olmadigini anlamak icin == kullanmak hatali
        sonuclmar verebilir. Bunun yerine equals methodunun kullanilmasi daha iyi olur. Yani equals
        methodu verilen metinlarin iceriklerini karsilastirir ve ayni ise true degilse false sonucunu verir.
         */
        System.out.println(str1.equals(str3));//true





    }


}
