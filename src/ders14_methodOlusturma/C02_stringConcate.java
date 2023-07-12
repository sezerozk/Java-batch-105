package ders14_methodOlusturma;

public class C02_stringConcate {
    /*
    Verilen iki string'i parametre olarak kabul edip bu iki string'i aralarinda
    bir bosluk olmak kaydiyla tek string olarak main method'a donduren bir method olusturun
     */
    public static void main(String[] args) {
        String str1 ="qwerty";
        String str2 = "azerty";
        System.out.println(stringBirlestirme(str1,str2));
        stringBirlestirme(str1,str2);

    }
    //Method iki defa cagrildigi için "2 usages" ifadesi gorunuyor
    public static String stringBirlestirme (String str1, String str2){
        return str1 +" "+str2;
    }


}
