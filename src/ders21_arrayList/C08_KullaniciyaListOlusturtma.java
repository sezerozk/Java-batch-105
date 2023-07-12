package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        //Soru; Kullainicdan istedigi kadar isim q' ya bastiginda
        // girilen isimleri bize list olarak donduren bir method olusturun.
        System.out.println(listOlustrutma());


    }
    public static List<String> listOlustrutma (){
        Scanner sc = new Scanner(System.in);
        String girilenIsim = "";
        List<String> isimler = new ArrayList<>();
       while (!isimler.contains("q")){
           System.out.println("Lutfen bir isim giriniz \n" +
                   "isim girisini sonlandirmak icin 'q' ya basiniz  ");
           girilenIsim = sc.nextLine();
           isimler.add(girilenIsim);

       }
       isimler.remove("q");
     return isimler;
    }

}
