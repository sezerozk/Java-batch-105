package ders10_stringManupulation;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        mail kontrolu yapan bir program yazin
        1- mail @ isareti icermiyorsa "gecersiz mail"
        2- @gmail.com icermoyorsa "g mail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatasi" yazdirin
         */
        String mail = "sezer.ozzkan@gmail.com";

        if (mail.contains("@")==false){
            System.out.println("gecersiz mail");
        } else if (mail.contains("@gmail.com")==false) {
            System.out.println("g mail adresi giriniz");
        } else if (mail.endsWith("@gmail.com")==false) {
            System.out.println("yazim hatasi");
        }else{
            System.out.println("tesekkurler");
        }


    }



}
