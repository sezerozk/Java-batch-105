package ders22_arraysList;

public class C05_For_EachLoop {
    public static void main(String[] args) {

        /*
        For-Each Loop gelismis for loop olarak bilinir. ve bir array ya da
        collection'daki tum elementleri index veya siralama olmaksizin bize
        getirir.
         */

        int [] arr = {3,5,7,8,4,2,6,9,6,4,5};
        //Bu array'deki 5'den buyuk tum elementleri toplayalim.
        int toplam = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>5){
                toplam+=arr[i];
            }
        }
        System.out.println("for-each loop ile "+ toplam);
        //Ayni islemi for-each loop ile yapalim.
        // for-each loop'a 3 seyi belirtmemiz gerekir
        // 1- Hangi data turu ile calisacaginizi
        // 2- loop'un icerisinde her bir element geldiginde hangi isimle islem
        // yapacaginizi belirtmelisiniz.
        // 3- Hangi array ya da collection'dan elementlerin gelecegi.
        toplam = 0;
        for (int each: arr
             ) {
            if (each>5){
                toplam+=each;
            }
        }
        System.out.println(toplam);
    }
}
