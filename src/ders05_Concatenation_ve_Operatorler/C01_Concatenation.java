package ders05_Concatenation_ve_Operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
        Bir String ibaska bir String veya primitive bir deger ile + ile isleme sokarsak
        Java bu degiskenleri birlestirerek yeni bir String olusturur.
        Ayrica String bir ifade ile sadece toplama islemi yapilabilir.
        String a = Hello;
        int b = 2;
        int c = 3;
        System.out.println(a+b+c); Hello23
        System.out.println(c+b+a); 5Hello
        System.out.println(a+(b+c)); Hello5
        System.out.println(a+b*c); Hello6
         */
        //SORU Sadece asagida verilen variable lari kullanrak istenen degerleri yazdiralim
        String s1 = "Java";
        String s2 = "Guzeldir";
        String s3 = "";
        String s4 = " ";


        int sayi1 = 4;
        int sayi2 = 3;
        // Java Guzeldir7
        System.out.println(s1+s4+s2+(sayi1+sayi2));
        //Java Guzeldir 12
        System.out.println(s1+s4+s2+s4+sayi1*sayi2);


    }


}
