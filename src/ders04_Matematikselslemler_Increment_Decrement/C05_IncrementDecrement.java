package ders04_Matematikselslemler_Increment_Decrement;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi = 10 ;
        //Bu sayiyi 3 artiralim ve yazidralim.
        sayi = sayi + 3 ;
        sayi+=3 ; //Iki kere sayi yazmamak icin boyle kullaniilir
        sayi++; // Bu yontemle sayi sadece 1 artar. post increment
        ++sayi; // pre increment
        System.out.println("sayi= "+sayi);

        int i = 10 ; //Bu sayinin degerini 1 eksiltelim
        i = i -1 ;
        i -= 1 ;
        i--; // post decrement
        --i; // pre decrement
        System.out.println(i);






    }



}
