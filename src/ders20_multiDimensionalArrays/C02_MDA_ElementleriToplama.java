package ders20_multiDimensionalArrays;

public class C02_MDA_ElementleriToplama {
    public static void main(String[] args) {
        int [] arr = {3,5,7,8};
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
        System.out.println("tek katli array elementler toplami: " + toplam);//tek katli array elementler toplami: 23
        int [] [] arr1 = {{1,2}, {3,4,5}, {7}};
        int toplam1 = 0;
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                toplam1+=arr1[i][j];
            }
        }
        System.out.println("katmanli array elementler toplami: " + toplam1);

    }
}
