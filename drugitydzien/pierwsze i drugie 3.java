package test.drugitydzien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class pierwsze i drugie 3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int value=0;
        for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {
                array[i][j]=value;
                value=value+5;
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
