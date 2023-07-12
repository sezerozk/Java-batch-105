package ders10_stringManupulation;

public class C10_Soru {
    public static void main(String[] args) {
         /*
        SORU: Kullanicidan bir cumle ve bir metin alin
        ve cumlede metnin durumuna gore
        1- cumle metni icermiyor
        2- cumle metni sadece bir kere iceriyor
        3- cumle metni birden fazla iceriyor
        seceneklerinden uygun olani yazin.
         */
        String str1 = "Java cok guzeldir cok ";
        String str2 = "cok";

        if (!str1.contains(str2)){
            System.out.println("cumle metni icermiyor");
        }else{
            int ilkindex = str1.indexOf(str2);
            int ikinciIndex = str1.indexOf(str2,ilkindex+1);
            int sonindex = str1.lastIndexOf(str2);
            if (sonindex==ilkindex){
                System.out.println("cumle metni sadece bir kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }


    }


}
