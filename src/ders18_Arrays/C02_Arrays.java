package ders18_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String [] arr = {"ali", "ulus", "nesrin"};
        //Bu array'in tum elementlerini aralaeinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Bu array'i array olarak yazdiralim
        System.out.println(arr);//[Ljava.lang.String;@7f690630
        //Array bir obje / non-primitive data turu oldugundan bu sekilde
        //yazildiginda Java array'in elementlerini degil referansini yazdirir
       // Array'i array olarak yazdirmak isterseniz Arrays class'indan yardim almalisiniz
        System.out.println(Arrays.toString(arr));



    }
}
