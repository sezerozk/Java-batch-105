package ders12_forLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        /*
        For loop, belli sayida tekrar eden bir donguyu verimli bir sekilde yazmaya
        olanak taniyan bir tekrar kontrol yapisidir.
         */
        String str = "Java\n";
        System.out.print(str.repeat(10));
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        //Iki basamakli sayilardan 7 ile bolunebilenleri yan yana yazdirin
        for (int a = 14; a <99 ; a++) {
            if (a%7==0){
                System.out.print(a+" ");
            }
        };
        System.out.println("");
        for (int i = 14; i <99 ; i+=7) {
            System.out.print(i+" ");//baslangic ve bitis degeri hesaplayabildigim icin %
                                    //kullanmadan yazdirdim
        }
        System.out.println("");
        //Birden ona kadar olan sayilarin karelerini yazdiralim
        for (int i = 1; i < 11; i++) {
            System.out.print(i*i+" ");
        }




    }
}
