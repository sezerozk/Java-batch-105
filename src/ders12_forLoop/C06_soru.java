package ders12_forLoop;

public class C06_soru {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir sayi alin ve sayiya kadar tam sayikari yazdirin
        yazdirirken 3 ile bolunebilen sayilarin yero=ine fizz 5 ile bolunebilen
        sayilarin yerine Buzz hem 3 hem 5 ile bolunebilen sayilarin yerine
         fizzBuzz yazdirin
         */
        int sayi = 130;
        for (int i = 1; i <sayi+1 ; i++) {
            if (i%15==0){
                System.out.print("fizzBuzz\n ");//"\n bir println yazilmasa dahi bir alt satira geçmemizi sagilyor"
            } else if (i%5==0) {
                System.out.print("Buzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            }else {
                System.out.print(i+" ");
            }
        }



    }
}
