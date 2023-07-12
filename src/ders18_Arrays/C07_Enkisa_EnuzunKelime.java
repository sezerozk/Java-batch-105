package ders18_Arrays;

public class C07_Enkisa_EnuzunKelime {
    public static void main(String[] args) {
        //SOUR. Verilen String bir array'deki en uzun ve en kisa kelimleri
        // yazdiran bir method olusturun.
        String [] arr = {"sjkdhf", "sdjkfhsdf","sdf"};
        kelimeUzunlugu(arr);



    }
    public static void kelimeUzunlugu ( String [] arr){
        String uzunKelime = arr[0];
        String kisaKelime = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length()>uzunKelime.length()){
            uzunKelime=arr[i];
            }
            if (arr[i].length()<kisaKelime.length()){
                kisaKelime=arr[i];
            }
        }
        System.out.println(uzunKelime);
        System.out.println(kisaKelime);
    }
}
