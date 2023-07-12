package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        int [] [] arr = {{4,3,1}, {1,2}, {5,6,7}, {}, {3,6,8,0} };
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//3
        System.out.println(arr[1]);//[I@4c203ea1 bir array direk yazdirilamayacagi icin
        //bu sekilde yazdirilmak istenirse referansi yazdirilmis olur.
        System.out.println(Arrays.toString(arr[1]));//[1, 2]
        // tum array'i yazdirmak istersek
        System.out.println(Arrays.deepToString(arr));//[[4, 3, 1], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]


    }
}
