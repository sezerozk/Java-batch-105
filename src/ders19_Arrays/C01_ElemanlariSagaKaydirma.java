package ders19_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class C01_ElemanlariSagaKaydirma {
    public static void main(String[] args) {
        //SORU ; Verilen bir array icin tum elementleri saga kaydirip
        // sondaki elementi de en basa getiren bir method olusturun ve
        // array'i yeni haliyle kaydedin.

        int [] arr = {4,5,6,7};
        elementleriSagaKaydirma(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int [] elementleriSagaKaydirma(int [] arr){
        int bosKova = arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = bosKova;
        return arr;
    }



}
