package ders11_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {
        String str = "Java candir.";
        System.out.println(str.replace('a', 'A'));//JAvA cAndir.
        //Buradaki degisiklik atama yapilmadigi için kalici bir degisiklik degildir
        System.out.println(str.replace(' ' , '_'));//Java_candir.
        System.out.println(str.replace("candir" , "cok guzeldir"));//Java cok guzeldir.
        System.out.println(str.replace(" " , ""));//Javacandir.
        //SORU str deki tum a lari silin
       str = str.replace("a" , "");
       System.out.println(str); // Jv cndir.
        str = "Java candir.";
        System.out.println(str.replace("Java", "hava")
                              .replace("hava","cok guzel"));//cok guzel candir.
        System.out.println(str.replace("","_"));//_J_a_v_a_ _c_a_n_d_i_r_._
        //Sadece ilk "a" yi "A" ile degistirin
        System.out.println(str.replaceFirst("a","A"));




    }


}
