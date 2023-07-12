package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Remove {

    public static void main(String[] args) {

        int [] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        sayilar.remove(2);
        sayilar.remove(5);
        System.out.println(sayilar);

        /*
        Listemiz integer'lardan olusuyorsa biz int bir deger yazdigimizda
        her zaman index olarak kabul ettiginden istefigimiz elementi obje olarak
        giril silmek istedigimizde ilgili elementi oncesinde tanimlamamiz gerekir.
         */
        Integer silinecekObje = 4;
        sayilar.remove(silinecekObje);
        //List'deki tum 3'leri sildirin
        silinecekObje = 3;
        while (sayilar.contains(3)){
            sayilar.remove(silinecekObje);
        }
        System.out.println(sayilar);
        /*
        list.remove(istenen obje); istenen objeyi siler ve bize true ya da false
        bir sonuc dondurur. Eger silinmek istenen obje list'de yoksa sonuc false doner.
        Silmak istediginiz index list'de yoksa exception olusur.
         */
        silinecekObje = 15;
        System.out.println(sayilar.remove(silinecekObje));// false
        System.out.println(sayilar.remove(20));// IndexOutOfBoundsException
        //list.removeAll() methodu bir listenin icinden diger bir listede yer alan
        // elementlerin tamamini siler.
        // list.indexOf(arananElement) bir listede istenen elementin ILK index'ini
        // bulmak icin kullanilir.
        // list.lastIndexOf(arananaElement) listede istenen elementin SON index'ini
        // bulmak icin kullanilir.


    }
}
