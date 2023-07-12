package ders19_Arrays;

import java.util.Arrays;

public class C06_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        //Var olan bir Ayyar'e yeni deger atanabilir mi?
        // Var olan bir Array'e elementleri tekrar yazarak yeni deger atayamayiz.
        //Ancak new word ile yeni deger atamasi yapilabilir. Varolan bir Array'in uzunlugunu
        // degistirmek degil yeni bir Array olusturmak oldugundan Java CTE vermez.

        /*
        Var oolan bir arrayin uzunlugu degistirlemez
        AMA
        var olan arraye yeni bir array deger olarak atanabilir
         */
        //1- var olan bir array'i yeni deger olarak atayabiliriz
        String [] arr1 = {"ali", "veli"};
        String [] arr2 = {"a" , "b" , "c"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));//[a, b, c]
        //2- Istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz.
        arr1 = new String[6];
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null, null]



    }
}
