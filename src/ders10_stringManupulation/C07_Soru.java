package ders10_stringManupulation;

public class C07_Soru {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan bir cumle ve bir metin alin
        ve cumlede metnin durumuna gore
        1- cumle metni icermiyor
        2- cumle metni sadece bir kere iceriyor
        3- cumle metni birden fazla iceriyor
        seceneklerinden uygun olani yazin.
         */
        String str1 = "Java  guzeldir ";
        String str2 = "cok";
        System.out.println(str1.indexOf(str2));
        int sayi = str1.indexOf(str2);
        System.out.println(str1.indexOf(str2, sayi + 1));
        

        if (!str1.contains(str2)){

            System.out.println("cumle metni icermiyor");
        } else if ((str1.indexOf(str2, sayi + 1)>(sayi))) {
            System.out.println("cumle metni birden fazla iceriyor");
        } else if ((str1.indexOf(str2)>=0)){
            System.out.println("cumle metni sadece bir kere iceriyor");
        }


    }


}
