package ders12_forLoop;

public class C03_faktoriyel {
    public static void main(String[] args) {
        //Kullanicinin verdigi sayinin faktoriyelini bulalim.
        int sayi = 10;
        int faktoriyel=1;
        for (int i = sayi; i >1 ; i--) {
            faktoriyel=faktoriyel*i;

        }
        System.out.println(faktoriyel);
        //Birden 100'e kadar olan sayilari toplayin
        int toplam=0;
        for (int i = 1; i <101 ; i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam);
    }
}
