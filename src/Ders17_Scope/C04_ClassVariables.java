package Ders17_Scope;

public class C04_ClassVariables {
    public static void main(String[] args) {
        //C03'teki hastane ismini yazdirmak istersek
        System.out.println(C03_ObjectVariables.hastaneIsmi);
        System.out.println(C03_ObjectVariables.hastaSayisi);//25567
        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi);//25570

    }
    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;
    }
    /*
    Java runtime programdir.
    Calismaya basladiginda variable'lara atanan degerleri isler
    calistigi muddetçe yapilan degisiklikleri kaydeder
    fakat calismasi bittiginde degisen degerler
    reset'lenir.
     */
}
