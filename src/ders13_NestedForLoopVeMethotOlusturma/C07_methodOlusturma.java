package ders13_NestedForLoopVeMethotOlusturma;

public class C07_methodOlusturma {
    public static void main(String[] args) {
        //Methodlar istedigimiz islemleri bizim adimiza yapan kod bloklaridir.
        /*
        Methodlar bize sonuc dondurup dondurmemesine gore ikiye ayrilir
        1- Bazi methodlar gorevlerini yaparlar ve fakat bize herhangi bir data turunde
        bir sonuc dondurmezler. Bu methodlarin return type'i void olur.
        2- Bize sonuc donduren methodlar.
         */

        String str = "Java muhtesemdir";

        //Metni buyuk harfe cevirin
        String buyukstr = str.toUpperCase();
        //Metnin buyuk harflere cevrilmis hali "s" icerir mi?
        System.out.println(buyukstr.contains("S"));
        /*
        public static void toplama (int say1 , int sayi2){
        System.out.println(sayi1 + sayi2)
        }
        1- access modifier; Methoda proje icerisinden nerelerden olusabilecegini belirler
        public= Proje icerisindeki tum class'larden kullanilabilir
        protected=Sadece icinde bulundugu package ve child class'larden kullanilabilir
        default= Sadece icinde bulundugu package'dan kullanilabilir
        private= Sadece icinde bulundugu class'tan kullanilabilir
        2- static = Acces modifier olmadigi halde method ve variable'lar için erisimi duzenler
        static olarak isaretlenmis methodlar method disinda bulunan variable ve methodlardan
        sadece static olarak isaretlenmis olanlara direk ulasabilir.
        3- return typr= Methodun hangi data turunden sonuç urettigini belirtir.
        Gorevi sadece bir sey yazdirmak olan yani bir data dondureyen methodlarin return type'i
        void olarak belirlenir.
        Method'un gorevi bize sonuc dondurmek ise dondurecegi sonuca uygun
        return type secilmeli.
        ****Methodlar main method disinda fakat class'in icinde yazilir
         */



    }
}
