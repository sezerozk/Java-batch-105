package ders16_DoWhileLoopScope;

public class C06_DoWhileTamKareSorusu {
    public static void main(String[] args) {
        /*
    Kullanicidan pozitif bir tam sayi isteyin ve sayinin tam kare olup olmadigini bulun.
    Tam kara ise true degilse false yazdirin.
     */

        int baslangicDegeri = 1;
        int input = 49;
        int bayrak = 0;
        do {
            if (baslangicDegeri*baslangicDegeri==input){
                System.out.println("true");
                bayrak++;
                break;
            }
            baslangicDegeri++;
        }while (baslangicDegeri*baslangicDegeri<=input);
        if (bayrak==0){
            System.out.println("false");
        }




    }
}
