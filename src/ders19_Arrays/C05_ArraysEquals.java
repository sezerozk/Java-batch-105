package ders19_Arrays;

import java.util.Arrays;

public class C05_ArraysEquals {
    public static void main(String[] args) {
        /*
        Arrays.equals(arr1,arr2); her bir indeks için elemanlari kontrol eder, tum
        indekslerdeki degerler karsilikli esit ise true degilse false dondurur.
        Yani tum elementlerin ayni olmasi gerektigi gibi siralamalari da ayni
        olmadlidir.
         */
        int [] arr = {2,5,8,3};
        int [] arr1 = {5,2,3,8};
        System.out.println(Arrays.equals(arr, arr1));//false
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr,arr1));//true


    }
}
