package ders14_methodOlusturma;

public class C03_StringTerseCevirme {
    /*
    Parametre olarak bir String'i kabul edip String'in terse cevrilmis halini
    main methoda donduren bir method olusturun.
     */

    public static void main(String[] args) {
        String str = "Java kod yazdikca ogrenilir";
        System.out.println(terseCevirme(str));


    }

    public static String terseCevirme(String str) {
        int karakterSayisi = str.length();
        String str1="";
        for (int i = 1; i <= karakterSayisi; i++) {
            str1 = str1 + str.substring(karakterSayisi - i, karakterSayisi - i + 1);
        }
        return str1;
    }
}



