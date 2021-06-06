package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin A kenarını Giriniz : ");
        a= scanner.nextDouble();
        System.out.print("Üçgenin B Kenarını Giriniz : ");
        b=scanner.nextDouble();
        System.out.print("Üçgenin C Kenarını Giriniz : ");
        c=scanner.nextDouble();
        double ucgeninCevresi;
        ucgeninCevresi = ((a+b+c)/2);
        double ucgeninAlani = (ucgeninCevresi*(ucgeninCevresi-a)*(ucgeninCevresi-b)*(ucgeninCevresi-c));
        System.out.print("Üçgenin Alanı : " + ucgeninAlani);
    }
}
