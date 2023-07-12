package ders13_NestedForLoopVeMethotOlusturma;

public class C06_NestedForLoopUcgen {
    public static void main(String[] args) {
          /*
        Nested forloop kullanarak asagidaki sekli olusturun

        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
         */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }



    }
}
