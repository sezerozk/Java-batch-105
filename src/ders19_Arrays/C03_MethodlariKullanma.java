package ders19_Arrays;

import ders18_Arrays.C03_ArraysElementArtirma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
        public static void main(String[] args) {
                // SORU ; Verilen bir int array'in elementlerini 2 artirin

                int[] arr = {2, 3, 4};
                arr = C03_ArraysElementArtirma.arrayElemanArtirma(arr);
                System.out.println(Arrays.toString(arr));
        }
}
