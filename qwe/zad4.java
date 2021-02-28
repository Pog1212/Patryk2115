package qwe;

import java.util.Scanner;

public class zad4 {
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
        if (raz < dwa && dwa < trzy) {
            System.out.println("rosnaco");
        } else {
            if (trzy < dwa && dwa < raz) {
                System.out.println("malejaco");
            }
            else {
                System.out.println("bez kolejnosci");
            }
        }
    }
}
