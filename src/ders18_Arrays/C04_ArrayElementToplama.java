package ders18_Arrays;

public class C04_ArrayElementToplama {
    public static void main(String[] args) {

        //SORU. Verilen bir array'deki pozitif tam sayilari toplayip
        // sonucu bize donduren bir method olusturun.

        int [] arr = {2, -3, 5, 7};
        System.out.println(elementleriToplama(arr));


    }
    public static int elementleriToplama (int [] arr) {
        int toplam = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
               toplam+=arr[i];
            }
        }
        return toplam;
    }
}
