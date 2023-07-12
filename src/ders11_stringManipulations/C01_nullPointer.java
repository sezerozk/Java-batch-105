package ders11_stringManipulations;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1 = "guzeldir";
        //str1 e bir deger atanmistir
        System.out.println(str1.concat("Java"));

        String str2 ;
        //str2 olusturuldu fakat deger atanmadi o sebeple konsolda yazdirilamaz ya da
        //methodlarla da kullanilamaz

        String str3 = null ;
        //str3 e deger atanmamistir null pointer ile Java ya deger atamadigilizin
        //farkinda oldugumuzu soyluyoruz. Boylece ornegin yazdirmak istesek
        //srt2 de gordugumuz hata durumu burada gorunmuyor. Fakat hala deger atanmadigi
        //icin methodlarla kulanilamaz.
        System.out.println(str3);
        //System.out.println(str3.concat("Ben aslinda yogum")); Bu method calismiyor
        System.out.println(str3 + "Java");//null java bir String methodu olmaya "+"
        // ile kullanilabiliyor





    }


}
