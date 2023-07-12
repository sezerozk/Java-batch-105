package ders16_DoWhileLoopScope;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // 10, 11, 12 sayilarini toplayan bir do while loop olusturalim
        int sayi = 10;
        int toplam =0;
        do {
            toplam+=sayi;
            sayi++;
        }while (sayi<13);
        System.out.println(toplam);
        /*
        Do while loop'un iki avantaji vardir
        1- loop body'si en az bir kere calisir
        2- bitis kontrolu loop sayisinca calisir
         */
    }
}
