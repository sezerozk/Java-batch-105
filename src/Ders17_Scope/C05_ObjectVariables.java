package Ders17_Scope;

public class C05_ObjectVariables {
    public static void main(String[] args) {
        //C03 class'indaki instance variable'lara nasil ulasabiliriz
        //instance variable'larin diger adi object variables'dir.
        //instance variable'lara object uzerinden ulasabiliriz.
        C03_ObjectVariables personel1 = new C03_ObjectVariables();//Bu sekilde object olusturmus olduk
        personel1.personelIsmi = "Suleyman";
        personel1.personelYasi = 25;
        personel1.personelTelefonu = "545";
        System.out.println(personel1.personelIsmi);

        C03_ObjectVariables personel2 = new C03_ObjectVariables();
        personel2.personelIsmi = "Latif";
        personel2.personelYasi = 35;
        personel2.personelTelefonu = "545";

        C03_ObjectVariables personel3 = new C03_ObjectVariables();
        personel3.personelIsmi = "Heysem";
        personel3.personelYasi = 36;
        personel3.personelTelefonu = "56465";
        System.out.println(personel1.personelIsmi);
        System.out.println(personel2.personelYasi);
        System.out.println(personel3.personelTelefonu);



    }
}
