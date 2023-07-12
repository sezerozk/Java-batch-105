package ders11_stringManipulations;

public class C04_replaceAll {
    public static void main(String[] args) {
        /*
        Kullanicinin girdigi metinde harf disinda kalan
        tum karakterleri temizleyen bir kod yazin
        NOT: space silinmemeli
         */
        String input = "Ja5+va cok 1+guzel";
        input = input.replaceAll("\\d","");//Ja+va cok +guzel
        input = input.replaceAll(" ", "5");
        input = input.replaceAll("\\W","");
        input = input.replace('5',' ');
        System.out.println(input);




    }
}
