package test.drugitydzien;

import java.util.Random;

public class czwarte2 {
    public static void main(String[] args) {
        String[] pozywienie = {"chleb","ziemniaki","placki","kielbasa","jajko","tost","mieso"};
        Random x = new Random();
        int sniadanie = x.nextInt(pozywienie.length);
        int obiad = x.nextInt(pozywienie.length);
        int kolacja = x.nextInt(pozywienie.length);

        System.out.println("Na sniadanie: "+pozywienie[sniadanie]+", na obiad: "+pozywienie[obiad]+", na kolacje: "+pozywienie[kolacja]);
    }
}
