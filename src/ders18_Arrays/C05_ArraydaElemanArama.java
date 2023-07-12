package ders18_Arrays;

public class C05_ArraydaElemanArama {
    public static void main(String[] args) {
        // SORU. Verilen bir array'da istenen bir elemanin var olup olmadigini
        // varsa kaç kere kullanildigini yazdiran bir method olusturun.

        int [] arr = {1,2,3,1,5};
        elemanBulma(arr,1);

        String str = "";

        System.out.println(arr.length);


    }
    public static void elemanBulma (int [] arr, int arananDeger){
        int bayrak = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arananDeger==arr[i]){
                bayrak++;
            }
        }
        if (bayrak>0){
            System.out.println("aradiginiz deger array icerisnde " + bayrak + " kere kullanilmaktadir");
        }
    }
}
