package qwe;

import java.util.Scanner;


public class zad1 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = podaj.nextInt();
        if (liczba == 0) {
            System.out.println("Liczba jest równa 0.");
        } else {
            if (liczba > 0) {
                System.out.println("Liczba jest większa od 0.");
            } else {
                if (liczba < 0) {
                    System.out.println("Liczba jest mniejsza od 0.");
                }
            }
        }
    }
}
