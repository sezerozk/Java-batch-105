package ders22_arraysList;

import java.util.Arrays;
import java.util.List;

public class C04_arraysAsList {
    public static void main(String[] args) {


        Integer [] arr = {1,2,3};
        List<Integer> sayilar = Arrays.asList(arr);
        System.out.println(sayilar);// [1, 2, 3]
        //Arrays.asList methid ile bir array'i dogrudan bir list'e cevirebiliyoruz
        // fakat bu yontemle olusturulan list esnek uzunluga sahip degildir ve
        // add, remove gibi ozelliklerden yararlanmak isterseniz run time exception
        // olusur
        // Ayrica bu yontem kullanildiginda kaynak array ile list arasinda bir baglanti
        // olusturulur ve birinde yapilan degisiklik otomatik olarak digerine yansir.
        // Kullanilmasinin avantajli olacagi dirimlar vardir fakat her zaman kullanmak
        // array'in esneklik ozelligini ortadan kaldirdigi icin makul olmaz.


    }
}
