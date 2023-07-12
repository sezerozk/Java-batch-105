package ders02_data_turleri_ve_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismlini alip buyuk harflerle yawdirma.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Adinizi Girniz");
        String kullaniciAdi= scan.next();
        System.out.println(kullaniciAdi.toUpperCase());


    }
}
