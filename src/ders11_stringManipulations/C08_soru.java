package ders11_stringManipulations;

public class C08_soru {
    public static void main(String[] args) {
        //Kullanicidan bir sifre isteyip
        //asagidaki sartleri kontrol ediin ve
        //kullaniciya duzeltmesi gereken eksikleri soyleyin
        //-ilk karakter kucuk harf olmali
        //-son karakter rakam olmali
        //-sifre bosluk icermemeli
        //-uzunlugu en az 10 karakter olmali
        String sifre = "dfghsdfsdjkl2";
        int bayrak = 0;

        if (sifre.charAt(0)<96&&sifre.charAt(0)>123){
            System.out.println("ilk kakakter kucuk harf olmali");
            bayrak++;
        }
        if (sifre.charAt(sifre.length()-1)<47 && sifre.charAt(sifre.length()-1)>58) {
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            bayrak++;
        }
        if (sifre.length()<10) {
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("islem basarili");
        }


    }
}
