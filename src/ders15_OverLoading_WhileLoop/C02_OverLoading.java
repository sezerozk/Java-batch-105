package ders15_OverLoading_WhileLoop;

public class C02_OverLoading {
    public static void main(String[] args) {
        carpim(3,5);//Methodda parantez icine yazilan degerlere argument denir.
        /*
        Method overloading olan durumlarda Java hangi methodun calisacagina su sekilde
        karar verir.
        1- Once method ismine bakar.
        2- Argument sayisi ile parametre sayisina bakar
        3- Argument ile parametre uyumuna bakar
        4- Hangi method ile minimum casting yapiyorsa onu calistirir
         */


    }

    public static void carpim (int sayi1, int sayi2){
        System.out.println(sayi1*sayi2);
    }

    public static double carpim (double sayi1, double sayi2){
        double carpim = sayi1*sayi2;
        return carpim;
    }

    public static void carpim (int sayi1, int sayi2, int sayi3){
        System.out.println(sayi1*sayi2*sayi3);
    }



}
