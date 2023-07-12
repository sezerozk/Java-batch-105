package ders22_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoopSoru {
    public static void main(String[] args) {
        //Soru; Verilen bir String Array'deki her bir elementi kontrol edip
        // - kelimenin uzunlugu cift sayi ise ilk yarisini
        // - kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir list'e ekleyip yazdirin.
        String [] arr = {"sumeyra", "mehmet", "ekrem", "yilmaz", "olmaz"};
        List<String>yeniListe = new ArrayList<>();

        for (String each: arr
             ) {
            if (each.length()%2==0){
                yeniListe.add(each.substring(0,(each.length()/2)));
            }else {
                yeniListe.add(each.substring((each.length()/2),each.length()));
            }
        }
        System.out.println(yeniListe);


    }
}
