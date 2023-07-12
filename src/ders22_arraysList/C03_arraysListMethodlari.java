package ders22_arraysList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_arraysListMethodlari {
    public static void main(String[] args) {

        /*
        bir listedeki elementleri siralamak icin
        Collections.sort(list) kullanilir
         */
        List<String> isimler = new ArrayList<>();
        isimler.add("veli");
        isimler.add("ali");
        isimler.add("yahya");
        isimler.add("tugba");
        Collections.sort(isimler);
        System.out.println(isimler);// [ali, veli]


        /*
        Bir list'in belirli bir bolumunu alma
        list.sunList(baslangicIndex,bitisIndex) baslagicIndex dahil bitisIndex dahil degil
         */
        System.out.println(isimler.subList(1, 3));// [tugba, veli]

    }
}
