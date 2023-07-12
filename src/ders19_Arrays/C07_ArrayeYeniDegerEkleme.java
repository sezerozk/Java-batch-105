package ders19_Arrays;

import java.util.Arrays;

public class C07_ArrayeYeniDegerEkleme {
    public static void main(String[] args) {
        int [] arr = {2,4,6};

        // Bu arraye dorduncu bir element olarak 8'i ekleyelim
//        int [] arr1 = {2,4,6,8};
//        arr = arr1;
//        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8]
//        bu yontemle de cozuluyor fakat asagida daha dinamik bir sekilde cozmeye calisalim

        int [] arr2 = new int[arr.length+1];
        System.out.println(Arrays.toString(arr2));// [0, 0, 0, 0, 0]
        for (int i = 0; i <arr.length ; i++) {
            arr2 [i] = arr [i];
        }
        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 0]
        arr2 [arr2.length-1] = 8;
        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 8]
        arr = arr2;
    }
}
