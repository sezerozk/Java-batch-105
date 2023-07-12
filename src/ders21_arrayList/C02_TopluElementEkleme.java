package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElementEkleme {
    public static void main(String[] args) {
        List <String> harfler =  new ArrayList<>();
        // Tum sesli harfleri listeye ekleyin
        // eklenecek tum elementleri bir Array olarak yazip
        // daha sonra forLoop ile listeye ekleyebiliriz.
        String [] arr = {"a", "e", "i", "o", "u"};
        for (int i = 0; i <arr.length ; i++) {
            harfler.add(arr[i]);
        }
        System.out.println(harfler);// [a, e, i, o, u]

    }
}
