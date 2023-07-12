package ders19_Arrays;

import java.util.Arrays;

public class C08_ArrayeElementEklemeMethodu {
    public static void main(String[] args) {
    //Verilen bir int array'e yeni element ekleyip
    //son halini bize donduren bir method olusturun
        int [] arr = {3,5,8,9};
        int eklenecekDeger = 1;
        System.out.println(Arrays.toString(ArrayeElementEkle(arr,eklenecekDeger)));//[3, 5, 8, 9, 1]


    }
    public static int[] ArrayeElementEkle(int [] arr,int eklenecekDeger){

        int [] arr1 = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
        arr1 [i] = arr[i];
        }
        arr1[arr1.length-1] = eklenecekDeger;
        arr = arr1;
return arr;
    }


}
