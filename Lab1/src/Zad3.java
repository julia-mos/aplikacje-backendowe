package Lab1.src;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {
       int[] array = new int[]{4,5,7,11,12,15,15,21,40,45};

        int index = searchIndex(array, 11); // we want to find index for 11
        System.out.println(index);
    }

    private static int searchIndex(int[] array, int value) {
        int index = 0;
        int limit = array.length - 1;
        while (index <= limit) {
            int point = (int)Math.ceil((index + limit) / 2);
            int entry = array[point];
            if (value > entry) {
                index = point + 1;
                continue;
            }
            if (value < entry) {
                limit = point - 1;
                continue;
            }
            return point;
        }
        return -1;
    }
}
