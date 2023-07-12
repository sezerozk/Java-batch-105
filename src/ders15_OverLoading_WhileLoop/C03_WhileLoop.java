package ders15_OverLoading_WhileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {
        /*
        Baslangic degerini ve artis degerinin manuel yazilmasi, while loop'u baslangicta
        kullanissiz gibi gosterebilir. Ozellikle artis/azalis miktari yazilmazsa kod sonsuz
        loop'a gidecektir.

        int s=10;(baslangic degeri)
        while(s<100){
        calisacak kodlar
        s++;
        }
         */

        //2 basamakli sayilari aralarinde bir bosluk olacak sekilde yan yana yazdirin

        for (int i = 10; i <100 ; i++) {
            System.out.print(i +" ");
        }

        //While loop ile yapalim
        System.out.println();
        int a = 10;
        while (a<100){
            System.out.print(a +" ");
            a++;
        }


    }
}
