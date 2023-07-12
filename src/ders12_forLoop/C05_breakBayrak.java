package ders12_forLoop;

public class C05_breakBayrak {
    public static void main(String[] args) {
        //Kullanicinin verdigi sayinin asal sayi olup olmadigini kontrol edin
        int sayi = 104;
        boolean bayrak = false;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                bayrak=true;
                break;
            }
        }
        if (!bayrak){
            System.out.println("asal sayi");
        }else{
            System.out.println("asal sayi degil");
        }


    }
}
