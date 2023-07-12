package ders16_DoWhileLoopScope;

import java.util.Scanner;

import static ders16_DoWhileLoopScope.C03_SifreKOntrolu.ozelKarakterKontrolu;

public class C04_SifreKontrolu {
    public static void main(String[] args) {
         /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edip ve sifredeki hatalari yazdirin. Kullanici gecerli bir sifre girinceye kadar
        bu islemi tekrar edin.
        -Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir
         */
        Scanner sc = new Scanner(System.in);
        String sifre;
        int bayrak ;
        do {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = sc.nextLine();
            bayrak=0;
            int sonuc = kucukHarfKontrolu(sifre);
            bayrak+=sonuc;
            sonuc = buyukHarfKontrolu(sifre);
            bayrak+=sonuc;
            sonuc = ozelKarakterKontrolu(sifre);
            bayrak+=sonuc;
            if (sifre.length()<8){
                System.out.println("Sifre en az 8 karakter olmalidir");
            }else {
                bayrak++;
            }
        }while (bayrak!=4);
        System.out.println("Sifreniz basari ile kaydedildi");





    }
    public  static int kucukHarfKontrolu(String sifre){
        int bayrak = 0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }
        }
        if (bayrak==0){
            System.out.println("Sifre kucuk harf icermelidir");
            return 0;
        }else{
            return 1;
        }
    }
    public  static int  buyukHarfKontrolu(String sifre){
        int bayrak = 0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                bayrak++;
                break;
            }
        }
        if (bayrak==0){
            System.out.println("Sifre buyuk harf icermelidir");
            return 0;
        }else{
            return 1;
        }
    }
    public  static int ozelKarakterKontrolu(String sifre){
        int bayrak = 0;
        String ozelKarakterler = "+-*/=)ç_èè-('':!,.";
        for (int i = 0; i <sifre.length() ; i++) {
            if (ozelKarakterler.contains(sifre.substring(i,i+1))){
                bayrak++;
                break;
            }
        }
        if (bayrak==0){
            System.out.println("Sifre ozel karakter icermelidir");
            return 0;
        }else{
            return 1;
        }
    }

}
