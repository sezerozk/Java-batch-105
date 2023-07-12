package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_containsMethodu {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        int [] arr = {2,5,68,7,6,3,65,6,9,0,7,4,3,1,2};
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar.contains(3));// true
        System.out.println(sayilar.contains(56));// false



    }
}
