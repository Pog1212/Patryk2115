package qwe;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int raz = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int dwa = y.nextInt();
        Scanner z = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int trzy = z.nextInt();
        if (raz == dwa) {
            System.out.println("Pierwsza liczba jest rowna drugiej.");
        }
        if (dwa == trzy) {
            System.out.println("Druga liczba jest rowna trzeciej.");
        }
        if (raz == trzy) {
            System.out.println("Pierwsza liczba jest rowna trzeciej.");
        }
        if (raz == dwa && dwa == trzy && raz == trzy){
        }
        else {
            if (raz > dwa) {
                if (raz > trzy)
                    System.out.println("Pierwsza jest najwieksza.");
            } else {
                if (dwa > trzy) {
                    System.out.println("Druga jest najwieksza.");
                } else {
                    System.out.println("Trzecia jest najwieksza.");
                }
            }
        }
    }
}