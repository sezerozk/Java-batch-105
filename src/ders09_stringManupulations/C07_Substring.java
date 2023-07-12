package ders09_stringManupulations;

public class C07_Substring {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(5,10));//5. indeksten baslar ve 10-5 yani 5 karakter yazdirir. Yani
        //10. indeks yazdirilmaz.
        String isim ="HASAN";
        //Verilen ismi ilk hqrfi buyuk geriye kalan harfleri kucuk olacak sekilde kaydedin.
        isim = isim.substring(0,1) + isim.substring(1).toLowerCase();
        System.out.println(isim);




    }



}
