package ders14_methodOlusturma;

public class C09_Soru {


    public static void main(String[] args) {
    int sayi = 24;
        System.out.println(asalSayiKontrolEtma(sayi));


    }
    public static String asalSayiKontrolEtma (int sayi){
        String sonuc = "Asal";
        for (int i = 2; i < sayi ; i++) {
            if (sayi%i==0){
                sonuc = "Asal degil";
                break;
            }
        }

        return sonuc;
    }



}
