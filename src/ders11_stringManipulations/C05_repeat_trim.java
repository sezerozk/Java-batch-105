package ders11_stringManipulations;

public class C05_repeat_trim {
    public static void main(String[] args) {
        String str = "java guzeldir ";
        System.out.println(str.repeat(3));//java guzeldir java guzeldir java guzeldir

        str = "    java guzeldir       ";
        System.out.println(str.length());//24
        System.out.println(str = str.trim());
        // str.trim metodu metnin basindaki ve sonundaki bosluklari siliyor
        System.out.println(str.length());//13

    }
}
