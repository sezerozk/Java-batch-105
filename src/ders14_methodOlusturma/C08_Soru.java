package ders14_methodOlusturma;

public class C08_Soru {
    /*
     Kullanicidan main method icinde pozitif bir tamsayi alin
     girilen sayinin asal sayi olup olmadigini kontrol edip,
     sonuc olarak "asal sayi" ya da "asal sayi degil" sonuclarini donduren bir
     method olusturun.
     */

    public static void main(String[] args) {
    int sayi=500;
    asalSayi(sayi);



    }

    public static void asalSayi(int sayi){
        int bayrak = 0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                bayrak+=1;
                break;
            }

        }
        if (bayrak>0){
            System.out.println("asal sayi degil");
        }else {
            System.out.println("asal sayi");
        }
    }



}
