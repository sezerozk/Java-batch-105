package ders19_Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {

        //SORU ; Verilen int arrya'de en buyuk ve en kucuk elementleri
        // yazdiran bir method olusturun.

        int [] arr = {5,8,66,4,889} ;
        EnBuyukEnKucukElement(arr);



    }
    public static void EnBuyukEnKucukElement (int [] arr){
       int EnBuyukSayi = arr[0];
       int EnKucukSayi = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (EnBuyukSayi<arr[i]){
                EnBuyukSayi = arr[i];
            }
            if (EnKucukSayi>arr[i]){
                EnKucukSayi = arr[i];
            }
        }
        System.out.println(EnBuyukSayi);
        System.out.println(EnKucukSayi);
    }
}
