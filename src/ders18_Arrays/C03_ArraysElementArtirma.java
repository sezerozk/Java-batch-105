package ders18_Arrays;

import java.util.Arrays;

public class C03_ArraysElementArtirma {
    public static void main(String[] args) {
        // SORU. Verilen bir int array'in tum elementlerini 2 artirarak
        // bize donduren bir method olusturun.
        // Eski array'i yeni haliyle kaydedin.

        int [] arr = {3,5,7,9};
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=2;
        }
        System.out.println(Arrays.toString(arr)); //[5, 7, 9, 11]
        arr = arrayElemanArtirma(arr);
        System.out.println(Arrays.toString(arr));//[7, 9, 11, 13]

    }

    public static int[] arrayElemanArtirma(int []arr) {
        for (int i = 0; i <arr.length ; i++) {
        arr[i]+=2;
        }
        return arr;
    }
}
