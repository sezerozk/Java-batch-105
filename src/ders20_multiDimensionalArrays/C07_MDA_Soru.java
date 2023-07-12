package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_Soru {
    public static void main(String[] args) {
        //Verilen iki katli bir array'de her bir ic aray'deki elementleri toplayip
        //yeni olusturacaginiz tek katli bir array'e bu toplamlari atayin.

        int [][] arr = {{3,1,2,4}, {1,2}, {3,4,5}, {10}, {2,7}};
        int [] toplamArr = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplamArr[i] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(toplamArr));


    }
}
