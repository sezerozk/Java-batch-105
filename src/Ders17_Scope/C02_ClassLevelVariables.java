package Ders17_Scope;

public class C02_ClassLevelVariables {
    // Class level varables methodlarin disinda olusturulurlar
    //genel kullanim en ustte olusturulmalaridir
    static String hastaneIsmi   = "Yildiz Hastanesi";
    static int hastaSayisi = 25567;
    static String basHekimIsmi ;
    String personelIsmi ;
    String personelTelefonu ;
    int personelYasi ;



    public static void main(String[] args) {
        /*
        Class level varables instance ve static olmak uzere ikiye ayrilirlar.
        Class level'da olusturulacak bir variable'in static ya da instance yapilmasina
        o variable'in claas'da olusturulacak objeler ile ilskisine bakilarak karar verilir.
         */
        System.out.println(hastaneIsmi);
        System.out.println(hastaSayisi);
        //Daha once static'in bir klup gibi oldugu ve sadece klup uyeleri ile muhatap
        //oldugu gibi bir ornek verilmisti. Burada main method static oldugundan static
        //variables main method icinde kullanilabilyor. Ayni sekilde static olmayan
        // class level variables da main method icersinde kullanilamiyorlar.
        System.out.println(basHekimIsmi);
        //Burada dikkat edilmesi gereken ise local variables deger atanmadan kullanilmazken
        //class level varables kullanilabilirler. Bu durumda Java data turune gore degisen
        // default olarak tanimlanan degerleri atar.
        //sayisal variables = 0
        //boolean = false
        // char = ""(bosluk degil hiclik)
        // Objeler(String dahil)=null

    }
    public static void method1(){
        System.out.println(hastaneIsmi);
        hastaSayisi++;
    }
    public void method2(){
        System.out.println(hastaneIsmi);//Burada dikkat edilmesi gereken bu method
        //static olmamasina ragmen bu methoddan static varables'a ulasiliyor.
        System.out.println(personelIsmi);
        System.out.println(personelTelefonu);
        System.out.println(personelYasi);
        //Farkli olarak bu methoddan static olmayan variables'a ulasilabiliyor.
    }
}
