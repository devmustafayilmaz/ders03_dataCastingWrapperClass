package ders03_dataCastingWrapperClass;

import java.util.Scanner;

public class C05_JavaWrapperSorulari {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz:");
        char chr = scan.next().charAt(0);
        System.out.println(""+(char)(chr+1)+(char)(chr+2)+(char)(chr+3));
        System.out.println("lutfen bir sayi giriniz :");
        int sayi= scan.nextInt();
        byte sayi1= (byte)sayi;

        System.out.println(sayi1);

        System.out.println("lutfen iki sayi giriniz :\n");
        double sayi3= scan.nextDouble();
        double sayi4=scan.nextDouble();
        int sonuc = (int)sayi3/(int)sayi4;
        System.out.println("sonuc : "+sonuc);

       System.out.println("lütfen iki sayi giriniz :\n");
        double sayi5 = scan.nextDouble();
        int sayi6= scan.nextInt();
         int sonuc1 = (int)(sayi5/sayi6);
       System.out.println("sonuc:"+sonuc1);

    }
}

