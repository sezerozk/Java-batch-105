package ders04_Matematikselslemler_Increment_Decrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

       /*
        int sayi = 10 ;
        sayi *= 5 ;// bu sekilde carpma ya da toplami islemi yaptirilabiliyor
        sayi += 5;
        System.out.println(sayi); 55
        */
        int a = 10 ;
        // a variable ini yazdirip daha sonra a nin degerini 1 artirin;
        System.out.println(a);//10
        a++;
        //bu islemi tek satirda yapmak icin sunu yapariw
        System.out.println(a++); // boyle oldugunda variable in degeri once yazdiriliyor sonra 1 artiriliyor
                                 // boylece 1 artirilarak 12 olan a 11 olarak yazdiriliyor.


        System.out.println(a); //12
        int b = 5;
        System.out.println(++b);//6
        /*
        burada b degeri once 1 artirilip sonra yazdiriliyor ve biz konsolda 6
        degerini goruyoruz.
         */










    }


}
