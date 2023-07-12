package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        //Verilen iki katli bir array'de ayni indekse sahip elementleri toplayip
        // yeni olusturacaginiz tek katli bir array'e bu toplamlari atayin.

        int [][] arr = {{3,4,5}, {2,3,6,7}};
        int ortakIndeksSayisi = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        int [] toplamArr = new int[ortakIndeksSayisi];

        for (int i = 0; i <ortakIndeksSayisi ; i++) {
            toplamArr[i] = arr[0][i] + arr[1][i];
        }
        System.out.println(Arrays.toString(toplamArr));
    }
}
