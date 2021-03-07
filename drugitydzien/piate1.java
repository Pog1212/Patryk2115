package test.drugitydzien;

import java.util.Arrays;
import java.util.Collections;
public class piate1 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Arrays.sort(intArray,10,20);
        Arrays.sort(intArray,0,10, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));
    }
}
