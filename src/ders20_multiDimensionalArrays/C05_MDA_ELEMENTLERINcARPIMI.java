package ders20_multiDimensionalArrays;

public class C05_MDA_ELEMENTLERINcARPIMI {
    public static void main(String[] args) {
        //Verilen iki katli bir int arrya deki tum sayilarin carpimini bize donduren
        //bir method olusturun
        int [] [] arr = {{5,7}, {5,8,9}, {1} };
        System.out.println(ElemetCarpimi(arr));


    }
    public static int ElemetCarpimi (int [] [] arr){
        int carpim = 1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim*=arr[i][j];
            }
        }
        return carpim;
    }
}
