package ders16_DoWhileLoopScope;

public class C01_WhileLoop {

    public static void main(String[] args) {
        // 10, 11, 12 sayilarini toplayan bir while loop olusturalim

        int sayi = 10;
        int toplam = 0;
         while (sayi<13){
             toplam+=sayi;
             sayi++;

         }
        System.out.println(toplam);
         /*
         While Loop'ta iki problemle karsilasabiliriz
         1- Once degeri kontrol edip sonra islem yaptigimizdan body'de bir kere daha
         kontrol etmek gerekebilir.
         2- Yaoilan islem sayisindan bir fazla defa bitis sarti kontrol edilir.
         3- While loop oncesinde degerleri kontrol edecegimiz bir variable olusturuyorsak
         yapacagimiz atamayi dikkatli yapmak gerekir, yanlis deger atamasi yapilmasi while
         loop'un calismamasina sebep olabilir.
          */


    }
}
