package ders03_dataCastingWrapperClass;
import java.util.Scanner;
public class C03_ExplicitNarrowing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz:");
        int girilenSayi = scan.nextInt();
        byte donusenSayi = (byte)girilenSayi;

        System.out.println("girdiginiz " + girilenSayi+" donusmushali "+donusenSayi);

        /*int sayi = 20;

        geniş data türündeki bir değeri
        dar data türndeki bir varibale!a tamak istrseniz
        java sorumluluğu almanızı ister

        bu sorumluluğu almak için cast edeceğimiz değerin
        onune() içersinde cast etmek istediğimizdata türü yazılır.


        short sh = (short)sayi;
        sayi = 287;
        byte byt = (byte)sayi;
        System.out.println(byt);*/




    }
}
