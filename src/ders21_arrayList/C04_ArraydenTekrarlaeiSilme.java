package ders21_arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlaeiSilme {
    public static void main(String[] args) {

        //verilen bir Array'deki tekrarlari ortadan kaldiralim
        int [] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!sayilar.contains(arr[i])){
                sayilar.add(arr[i]);
            }
        }
        System.out.println(sayilar);
        arr = new int[sayilar.size()];
        for (int i = 0; i <sayilar.size() ; i++) {
            arr[i] = sayilar.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
