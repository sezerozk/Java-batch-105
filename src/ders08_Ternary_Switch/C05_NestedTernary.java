package ders08_Ternary_Switch;

public class C05_NestedTernary {
    public static void main(String[] args) {
        /*
        SORU Kullanicidan bir tam sayi alin sayi pozitifse cift sayi ya da cift sayi degil
        seceneklerinden sayi negatifse uç basamakli ya da degil secenelerinden uygun olani yazdirin
         */
        int a = -150;

        System.out.println(a>0 ? (a%2==0 ? "cift sayi" : "Cift sayi degil"): (a<=-100 && a>-1000 ? "uc basamakli sayi" : "uc basamakli degil") );
        if (a>0){
            System.out.println(a%2==0 ? "cift sayi" : "cift sayi degil");
        }else {
            System.out.println(a<=-100 && a>-1000 ? "uc basamakli sayi" : "uc basamakli degil");
        }
        // Bu ornekte oldugu gibi il-else yapisi icersinde de ternary operator kullanilabilir
        // ve bazen bu kullanim daha okunabilir kod yazilmasini saglayabilir.


    }


}
