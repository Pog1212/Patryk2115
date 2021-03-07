package test.drugitydzien;

import java.util.Arrays;
import java.util.Collections;

public class drugie2 {
    public static void main(String[] args) {
        String[] stringArray = {"q","w","e","r","t","y","u","i","o","p"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Malejąco: " + Arrays.toString(stringArray));
    }
}
