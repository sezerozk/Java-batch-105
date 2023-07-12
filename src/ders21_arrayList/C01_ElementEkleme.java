package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {

        List <Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar.add(10));// true, Burada element eklemek icin add methodunu kullaniyoruz
        // fakat bu methodun bir baska ozelligi ise boolean sonuc dondurmesidir. Yani eklemek istedigimiz
        // elementin eklendiginden emin olmak istiyorsak bu sekilde yazdirip kontrol edebiliriz.
        System.out.println(sayilar);// [10]
        sayilar.add(20);// List tersi belirtilmedikçe eklenen elementi sona ekler.
        sayilar.add(1,15);
        System.out.println(sayilar);//[10, 15, 20] Burada index belirterek ekleme yapmis olduk.
        // Listenin basina 44 ekleyin
        sayilar.add(0,44);
        System.out.println(sayilar);// [44, 10, 15, 20]
        List<Integer> eklenecekListe = new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);
        //sayilar list'inin sonuna eklenecekListe'yi ekleyin
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);// [44, 10, 15, 20, 3, 5]
        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);// [44, 3, 5, 10, 15, 20, 3, 5]


    }
}
