package ders19_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_StringSplit {
    public static void main(String[] args) {
        // str.split methodu bir Stringi istedigimiz parcalara ayirarak
        // Array'e civirir.
        String str = "Java gercekten cok cok guzel";
        // Verilen String'de kac tane e harfi oldunu bulunuz.
        String [] eArrayi = str.split("e");
        System.out.println(Arrays.toString(str.split("e")));//[Java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length);//5
        System.out.println("Metindeki e sayisi : " + (eArrayi.length-1));
        //2. Yontem
        //String'i ""(hiclik) ile split yaparak karakterlerine ayiralim
        String [] tumKarakterlerArr = str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));//[J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]
        // Bir loop olusturarak tum karakterleri kontrol edebiliriz
        int sayac = 0;
        for (int i = 0; i <tumKarakterlerArr.length ; i++) {
            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }
        }
        System.out.println("Metinde " + sayac + " tane e harfi vardir");


    }
}
