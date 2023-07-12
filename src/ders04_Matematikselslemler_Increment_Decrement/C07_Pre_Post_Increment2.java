package ders04_Matematikselslemler_Increment_Decrement;

public class C07_Pre_Post_Increment2 {
    public static void main(String[] args) {
        int a = 10;

        int b = a++;
        /*
        burada a++ seklinde kullanildigi icin once atama islemi yapilacak ardindan artirma islemi
        yapilacak. Yani once a nin 10 olan degeri b ye atanacak ve b 10 olacak. Ardindan a nin degeri 1
        artirilacak ve a 11 olacak.
         */
        int c= ++b;
        /*
        Burada once artirma islemi sonrasinda atama islemi yapilacak. Yani b nin 10 olan degeri 1 artilicak ve
        b 11 olacak ve c ye 11 degeri atanacak.
         */
        System.out.println("a;" +a +" b; "+ b + " c; " + c); //a;11 b; 11 c; 11

        a=20;
        System.out.println(a++); //20
        System.out.println(--a); //20
        System.out.println(a--); //20
        System.out.println(a);   //19





    }


}
