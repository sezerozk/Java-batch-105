package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Set {
    public static void main(String[] args) {

        int [] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);

        // Java'da set() methodu update için kullanilir
        // add() ile set() birbirinden farklidir
        sayilar.set(0,8);//Burada 0. indeksteki elementi 8 yaptik. fakat bu islemi yazdiracak olursak
                         // degistirilen elementin degeri 1 olarak goruluyor
        System.out.println(sayilar.set(1, 9));// 2
        // eger eski degeri saklamak istiyorsak;
        int eskiDeger = sayilar.set(2,45);
        System.out.println(eskiDeger);// 4
        System.out.println(sayilar);


    }
}
