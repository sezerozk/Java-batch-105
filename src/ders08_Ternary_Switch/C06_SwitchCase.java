package ders08_Ternary_Switch;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Girilen gun numarasina gore gunun ismini yazdirin
         */
        int gunno = 5;

        switch (gunno){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
                /*
                break kullanilmadigi takdirde ilgili case den sonra gelen tum case ler de calisir.
                 */



        }


    }



}
