package qwe;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("Login: ");
        String log = login.next();
        Scanner haslo = new Scanner(System.in);
        System.out.println("Haslo: ");
        String has = haslo.next();
        if (log.equals("Patryk") && has.equals("Likszo")){
            System.out.println("Zalogowano.");
        }
        else {
            System.out.println("Niepoprawny login lub hasło.");
        }
    }
}
