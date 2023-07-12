package ders02_data_turleri_ve_scanner;

public class C01_variables {
    public static void main(String[] args) {
        int okulno = 885;
        System.out.println(okulno);
        System.out.println("okulno"); //"...." icerisindeki ifade java tarafindan aynen yazdiriliyor
        System.out.println("okul no : "  + okulno);
        okulno   = 100;//kapama isareti unutulmamali;;;;;

        System.out.println(okulno);
        int not1, not2, not3;//biden fawla variable in ayni anda atanmasi mumkun fakat çok tercih edilmez
        not1= 80;
        not2= 90;
        not3=(not1+not2)/2;
        System.out.println(not3);
        /*data turleri notlari
        boolean= mantiksal data sonuçlari için kullznilir. iki sonuç olabilir true ya da false. 1 bit yer kaplar
        char= tek bir karakter barindirir. sayi harf ya da owel karakter olabilir. tek tirnak içinde olmak zorunda.
         */


    }


}
