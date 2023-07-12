package ders03_dataCastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi = 20;
        /*
        genis data turundeki bir deger daha dar bir data turune atamak isterseniz
        Java sorumlulugu ustlenmenizi ister.
        Bunun icin daha kucuk data turunun parantez icinde belirtilmesi yeterli oluyor.
         */
        short sh = (short)sayi;
        System.out.println(sh);


        double dbl = 23.5;
        int say =(int) dbl;// bu ornekte double i int a cast ediyoruz ve fakat int gosterildiginde
                           // virgulden sonrasi silinir.
        System.out.println(say);




    }


}
