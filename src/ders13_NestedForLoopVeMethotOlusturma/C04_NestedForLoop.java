package ders13_NestedForLoopVeMethotOlusturma;

public class C04_NestedForLoop {
    public static void main(String[] args) {
     /*
     Asagidaki sekli yazdiran bir kod hazirlayin
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *

     */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //Dikkat edilmesi gereken nokta:
        //distaki loop satirlari kontrol ederken icteki loop sutunlari kontrol ediyor.



    }
}
