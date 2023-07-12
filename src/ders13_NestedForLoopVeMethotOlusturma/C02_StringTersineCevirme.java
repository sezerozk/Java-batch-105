package ders13_NestedForLoopVeMethotOlusturma;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {
        //Kullanicidan bir string isteyin ve tersine cevirerek kaydedin
        String str = "Java her gecen gun guzellesiyor";
        String tersstr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersstr += str.substring(i,i+1);//BURADA NEDEN += KULLANDIGIMIZI ANLAMADIM
        }
        System.out.println(tersstr);//royisellezug nug neceg reh avaJ




    }
}
