package ders08_Ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        Ternary operatoru tek basina kullanilamaz cunku ternary bir sonuç uretir
        ve bu sonuc ya yazdirilmali ya da bir variable a atanmalidir
         */

        int a = 5;

        String sonuc = a%2 == 0 ? "çift sayi" : "Tek sayi";
        /*
        Ayrica ternary nin sonucu bir variable a ataniyorsa true ve false durumlarinda
        uretilen sonuclarin her ikisi de cevrilen data turu ile uyumlu olmalidir.
         */

        //String sonuc2 = a>10 ? "Buyuk sayi" : a*2 ;
        // Bu sekilde yazilan kodda a*2 nin sonucu integer olacagindan integer in string e
        //atanmasini Java kabul etmiyor

        String sonuc2 = a>10 ? "Buyuk sayi" : ""+a*2 ;
        System.out.println( a>10 ? "Buyuk sayi" : a*2);//Fakat ternary sout icerisinde kullanildiginda
        //ortaya cikabilecek sonuclarin data turleri farkli olsa da kod calisir.



    }
}
