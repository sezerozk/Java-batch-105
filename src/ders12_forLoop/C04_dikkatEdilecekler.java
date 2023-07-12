package ders12_forLoop;

public class C04_dikkatEdilecekler {
    public static void main(String[] args) {
    /*
    SONSUZ LOOP
     for (int i = 0; i >-10 ; i++) {
            System.out.print(i+" ");
        }
        Burada aranan sart her ihtimalde saglanmaya devam ettigi icin bitmeyen bir dongu olusuyor.
        Ram icin çok zararli.
     */
        for (int i = 0; i >10 ; i++) {
            System.out.println(i);
        }
        //Burada ilk deger icin sart saglanmiyorsa dongu calissa da
        // for budy'si hicbir zaman calismaz
        //Kullanicinin verdigi sayinin asal sayi olup olmadigini bulunuz
        //Bu soru loop'un sonunu beklemeden bitirmeyi anlatabilmek icin sorduk
        int sayi = 104;
        int bayrak = 0;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0) {
                bayrak++;
            break;//sart gerceklestigi anda loop'u bitirmis oluyoruz. Zaman ve enerji tasarrufu
            }

        }
        System.out.println(bayrak);
        if (bayrak==0){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }
    }
}
