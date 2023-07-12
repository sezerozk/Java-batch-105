package ders20_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_ArrayList {
    public static void main(String[] args) {
        // ArrayList dinamik ve yeniden boyutlandirilabilir bir Array' dir.
        // ArrayList Array alt yapisini kullandigi için element ekleme
        // islemi birer birer yapilabiliyor.

        List <Integer> sayilar = new ArrayList<>();
        // 1-List primitive data turu kabul etmez
        // 2- List class degil bir interface oldugu için direk obje
        //    olusturulamaz bunun yerine sag tarafa ArrayList<>() yazariz

        sayilar.add(3);
        sayilar.add(4);
        System.out.println(sayilar);

    }
}
