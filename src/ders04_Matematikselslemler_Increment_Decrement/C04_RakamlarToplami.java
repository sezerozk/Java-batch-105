package ders04_Matematikselslemler_Increment_Decrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        /*
        Kullanicinin girdigi dort basamakli bir sayinin rakamlar toplamini veren bir kod yaziniz
         */
        int input = 1453;

        int birlerbasamagi;
        int rakamlartoplami=0;
        /*
        Rakamlar toplamini bulabilmek icin iki variable a ihtiyacimiz var.
        Modulus(%) teknigi bir sayinin on ile bolumunden kalani bulmamizi
        sagliyor.
         */

        birlerbasamagi = input%10;
        rakamlartoplami = rakamlartoplami + birlerbasamagi;
        input = input/10;

        birlerbasamagi = input%10;
        rakamlartoplami = rakamlartoplami + birlerbasamagi;
        input = input/10;

        birlerbasamagi = input%10;
        rakamlartoplami = rakamlartoplami + birlerbasamagi;
        input = input/10;

        birlerbasamagi = input%10;
        rakamlartoplami = rakamlartoplami + birlerbasamagi;
        input = input/10;

        System.out.println(rakamlartoplami);




    }


}
