package ders14_methodOlusturma;

public class C07_Soru {


    /*
        Kullanicidan main method icinde ayri ayri isim ve soyisim alin
        isim ve soyismi ilk harfler buyuk diger harfler kucuk olacak sekilde
        duzenleyip isim bosluk soyisim seklinde bize donduren bir method olusturun
         */
    public static void main(String[] args) {
    String isim = "ali";
    String soyisim = "yilmaz";
        System.out.println(isimDuzenleme(isim, soyisim));


    }

    public static String isimDuzenleme(String isim, String soyisim){
        String str = "";
        str =   isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase()
                + " " +
                soyisim.substring(0,1).toUpperCase()+(soyisim.substring(1));
        return str;
    }




}
