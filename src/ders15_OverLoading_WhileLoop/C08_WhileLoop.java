package ders15_OverLoading_WhileLoop;

public class C08_WhileLoop {

    public static void main(String[] args) {
    //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
        int sayi = 5236;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while (sayi!=0){
            birlerBasamagi = sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        System.out.println(rakamlarToplami);


    }
}
