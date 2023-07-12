package ders11_stringManipulations;

public class C07_soru {
    public static void main(String[] args) {
        /*
            Kullanicidan isim ve soyismini ayri ayri alin
            -isim daha uzun ise isim ve soy ismini ilk harfler buyuk kalanlar kucuk olacak sekilde
            -soyisim daha uzun ise ismi ilk harf buyuk kalanlar kucuk soyismi tum harfler buyuk
            olacak sekilde yazdirin
         */
        String isim = "mehmet";
        String soyisim = "akyurek";
        if (isim.length()>soyisim.length()){
            String yeniisim = isim.substring(0,1).toUpperCase()
                    +isim.substring(1).toLowerCase();
            String yenisoyisim = soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();
            System.out.println(yeniisim+" "+yenisoyisim);
        } else   {
            String yeniisim = isim.substring(0,1).toUpperCase()
                              +isim.substring(1).toLowerCase();
            String yenisoyisim =  soyisim.toUpperCase();
            System.out.println(yeniisim+" "+yenisoyisim);
        }




    }
}
