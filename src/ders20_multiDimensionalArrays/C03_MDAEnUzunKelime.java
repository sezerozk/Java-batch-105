package ders20_multiDimensionalArrays;

public class C03_MDAEnUzunKelime {
    public static void main(String[] args) {
        //Verilen bir string multi dimensional array'deki en uzun
        //String'i bulan bir kod yaziniz
        String [] [] arr = {{"ilker", "nesrin"}, {"hasan", "heysem", "adem", "yusuf enes"}};
        String EnUzunKelime = "";
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j].length()>EnUzunKelime.length()){
                    EnUzunKelime = arr[i][j];
                }
            }
        }
        System.out.println(EnUzunKelime);

    }
}
