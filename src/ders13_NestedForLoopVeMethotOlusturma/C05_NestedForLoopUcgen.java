package ders13_NestedForLoopVeMethotOlusturma;

public class C05_NestedForLoopUcgen {
    public static void main(String[] args) {
        /*
        Nested forloop kullanarak asagidaki sekli olusturun

        1
        1 2
        1 2 3
        1 2 3 4
         */

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }



    }
}
