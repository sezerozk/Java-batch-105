package ders05_Concatenation_ve_Operatorler;

public class C02_Relational_Operators {
    public static void main(String[] args) {
        /*
        Java da esitligi kontrol etmek icin == isareti kullanilir ve cevabi true ya da false
        olarak doner.
        != Bu iki isaret bir arada esit degildir anlamina gelir.
        Java da herhangi bir mantiksal de gerin basina konulan ! isareti o mantiksal ifadenin degerini tersine cevirir.
        */
        /*
        And (&) operatoru: Mantiktaki and operatorunun Java da iki tane karsiligi vardir. & ve &&
        islevleri ayni olamkala birlikte iç isleyis ve hiz acisindan kucuk faarkliliklar vardir.
        && operatoru birlestirdigi iki boolean ifadenin ikisi de true ise sonucu true yapar,
        bunun dusundaki tum durumlarda sonucu false yapar.
         */
        /*
        && ile & in farki; && operatoru birbirne bagli mantiksal ifadeleri incelerken ilk false degeri ile
        karsiliastigi anda geriye kalan ifadeleri incelemeksiwin sonucu false olarak atar ve bu sebeple & operatoune
        gore daha hizli calisir.
         */
        int a = 10;
        int b = 20;
        System.out.println(a>b && b>0 && a>0);

        boolean sonuc = 3*a<= 2*b && a>=10 && b>=20;
        System.out.println(sonuc);
        /*
        OR Operatoru; || operatoru birlestirdigi iki boolean ifadenin ikisi de false ise sonucu false yapar
        diger tum ihtimallerde sonucu true yapar.
         */


    }


}
