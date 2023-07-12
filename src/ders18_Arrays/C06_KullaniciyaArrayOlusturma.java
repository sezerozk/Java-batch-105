package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {

        //SORU. Kullanicidan array'in boyutunu ve
        // elementlerini alip bize donduren bir method olusturun.
        System.out.println(Arrays.toString(arrayOlusturma()));


    }
    public static int[] arrayOlusturma (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen array'in elemnt sayisini giriniz");
        int arrayBoyutu = sc.nextInt();
        int [] arr = new int[arrayBoyutu];
        for (int i = 0; i <arrayBoyutu ; i++) {
            System.out.println("lutfen " + i + ". indekteki elementi giriniz");
            arr [i] = sc.nextInt();
        }
        return arr;
    }

}
