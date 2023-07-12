package ders19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOLusturma {
    public static void main(String[] args) {
        //Kullanicinin girdigi sayilari arraye donusturun
        //kullanici element girisini bitirmek icin 0'a bassin
        Scanner sc = new Scanner(System.in);
        int girilenSayi ;
        int [] arr = {0} ;
        do {

            System.out.println("Lutfen bir sayi giriniz "+ "\nsayi girisini sonlandirmak icin 0' basiniz");
            girilenSayi = sc.nextInt();
            if (arr[0] == 0){
                arr[0] = girilenSayi;
            }else if (girilenSayi!=0){
                arr = C08_ArrayeElementEklemeMethodu.ArrayeElementEkle(arr,girilenSayi);
            }

        }while (girilenSayi!=0);
        System.out.println(Arrays.toString(arr));



    }
}
