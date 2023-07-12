package ders14_methodOlusturma;

public class C04_TerseCevirmeCharAt {
    /*
    Parametre olarak bir String'i kabul edip String'in terse cevrilmis halini
    main methoda donduren bir method olusturun.
     */
    public static void main(String[] args) {

        String str = "Java kod yazdikca ogrenilir";
        System.out.println(terseCevirme1(str));


    }
    public static String terseCevirme1(String str) {
        String tersHal = "";
        int karakterSaysisi = str.length();
        for (int i = karakterSaysisi-1; i >=0 ; i--) {
            tersHal= tersHal + str.charAt(i);
        }
        return tersHal;
    }
}
