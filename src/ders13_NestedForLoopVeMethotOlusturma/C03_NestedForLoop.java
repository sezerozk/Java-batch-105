package ders13_NestedForLoopVeMethotOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        Bazen verilen gorevi yapmak icin tek bir loop yeterli olmaz. Ornegin bir
        carpim tablosu hazirlamak ya da bir futbol liginde oynanacak maclari planlamak icin
        tek bir loop yeterli olmaz.
         */
        //1-4 araligindaki sayilar icin carpim tablosu olusturalim
        for (int i = 1; i <=4 ; i++) {
            for (int a = 1; a <=4 ; a++) {
                System.out.print(i*a+" ");
            }
            //Ic dongu bittiginde kodun bir alt satirdan devam etmesi icin:
            System.out.println("");


        }



    }
}
