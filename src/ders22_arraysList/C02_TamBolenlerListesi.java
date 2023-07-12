package ders22_arraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {

        //Soru; Kullanicidan pozitif bir tam sayi alin ve sayiyi tam
        // bolebilen tum sayilari bize liste halinde donduren bir
        // method olusuturu.
        System.out.println(tamBolenlerListesi());


    }
    public static List<Integer> tamBolenlerListesi(){
        List<Integer> tamBolenlerListesi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = sc.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }



}
