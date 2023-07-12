package Ders17_Scope;

public class C01_Scope {
    public static void main(String[] args) {
        /*
        - Scope bir variable'in erisilebildigi alandir.
        -Scope, variable'in olusturuldugu yer goz onune alinarak 2 ana gruba ayrilir
        1- Local variable'lar
        Local varibale'lar bir method ya da kod blogu icinde olusturulan variable'lardir.
        Local varable'larin scopu icerisinde olusturulduklari kod blogudur
        ve o blogun disinda kullanilamazlar.

         */
        int sayi = 10;
        String isim = "Ramazan";
        for (int i = 1; i <10 ; i++) {
            String adres = "Fr";
            /*
            Bir loop icerisinde olusturulan variable'lar o loop disinda kullanilamaz
             */
        }
//        adres = ""; Adres variable'ina loop disindan ulasamiyoruz
        double pi;
//        System.out.println(pi);
        //local variable'lar deger atamdan olusturulabilir fakat kullanilamaz


    }
    public static void method(){
//        System.out.println(sayi);
//        isim = "tugay";
        //Ulasilmak istenen degiskenler baska bir methodun(main method)
        //icersinde oldugundan ulasilamiyor
    }

}
