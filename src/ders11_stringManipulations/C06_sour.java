package ders11_stringManipulations;

public class C06_sour {
    public static void main(String[] args) {
        // SORU: Kullanicidan bir cumle alin
        //-cumlede ev geciyorsa home sweat home
        //-cumlede is gecioyrsa calismak guzeldir
        //-ikisini de iceriyorsa hem ev lazim hem is
        //-hic birini icermiyorsa cok calismak lazim yazdirin
        String cumle = "ve geldim sler birikms";
        if (cumle.contains("ev")&&cumle.contains("is")){
            System.out.println("hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home sweat home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        }else{
            System.out.println("cok calismak lazim");
        }


    }


}
