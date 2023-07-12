package ders19_Arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,8,9,3,7,2,5,8,1};
        /*
        Binary search methodunun dogru sonuc verebilmesi icin oncelikle sort methodu kullanilmalidir.
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 7, 8, 8, 9]
        System.out.println(Arrays.binarySearch(arr,1));//1
        System.out.println(Arrays.binarySearch(arr,5));//4
        // Array'de olmayan bir sayi aratildiginda Java ilk once
        // o sayinin olup olmadigini kontrol eder ve eger yoksa
        // negatif bir sonuc dondurur. Buradaki sayinin negatif
        // olmasi aranan elementin array'de olmadiginin gostergesi
        // iken sonrasindaki sayi aranan element eger array'de olsa
        // idi nerede olurdu sourusunun cevabini verir. Fakat burada
        // verdigi sonuc indeks degil bulunacagi SIRA' dir.
        System.out.println(Arrays.binarySearch(arr,15));//-10
        System.out.println(Arrays.binarySearch(arr,7));//5





    }
}
