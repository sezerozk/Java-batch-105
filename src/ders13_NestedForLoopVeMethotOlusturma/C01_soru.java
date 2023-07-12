package ders13_NestedForLoopVeMethotOlusturma;

public class C01_soru {
    public static void main(String[] args) {
        //Kullanicidan bir string alin ve tersten yazdirin
        String str = "java ne kadar guzel";

        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }


    }
}
