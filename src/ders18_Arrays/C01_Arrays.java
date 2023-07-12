package ders18_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
        Array'ler Java'da ayni data turunde birden fazla eleman barindirabilen
        objelerdir.
        Bir array olusturulurken 2 sey mutlaka deklare edilmelidir
        1- icine konulacak elementlerin data turu
        2- icine kac tane element konulacagi
        Array'ler primitive data turundeki datalarin degerlerini
        non-primitive data turundeki datalarin ise referanslarini barindirirlar.
        Bir array iki sekilde deklare edilir
        1- int arr[];
        2- int [] arr;

        int [] arr = new int [5];   ======> [0, 0, 0, 0, 0]
        */
    int [] arr1 = {2,4,6,8,10};
    //array'in bir elementine ulasmak ve update etmek istersek
        System.out.println(arr1[2]); //6
        arr1[3] = 20 ;
        System.out.println(arr1[3]); //20
        //Bu satirdan sonra 3. indeksteki element update edilmis olacagi için
        //bundan sonra 20 olacaktir

        System.out.println(arr1.length); //5
        //son elementi yazdirin
        System.out.println(arr1[arr1.length-1]);//10

        //Array'in tum elementlerini yazdirin
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i] + " "); //2 4 6 20 10
        }



    }
}
