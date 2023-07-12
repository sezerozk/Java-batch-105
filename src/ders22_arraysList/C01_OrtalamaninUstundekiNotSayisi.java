package ders22_arraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotSayisi {
    public static void main(String[] args) {

        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen q'ya basip bitirdiginde ogrenci sayisini, sinif ortalamasini ve
        // kac kisinin ortalamanin ustunde not aldigini yazdirin.

        List<Integer> notlar = new ArrayList<>();
        int not = 1;
        Scanner sc = new Scanner(System.in);
        while (not != 0){
            System.out.println("Lutfen ogrencinin notunu giriniz  \n " +
                    "not girisini sonlandirmak icin 0' a basiniz.");
            not = sc.nextInt();
            if (not!=0){
                notlar.add(not);
            }

        }
        System.out.println("Sinifta toplam " + notlar.size() + " ogrenci bulunmaktadir");
        int toplamNot = 0;
        for (int i = 0; i <notlar.size() ; i++) {
            toplamNot+=notlar.get(i);
        }
        int notOrtalamasi = toplamNot/notlar.size();
        System.out.println("sinif ortalamasi = " + notOrtalamasi);
        int count = 0;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>notOrtalamasi){
                count++;
            }
        }
        System.out.println(count + " ogrenci sinif ortalamasinin ustunde bir not almistir.");

    }




}
