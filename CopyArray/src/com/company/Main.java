package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] first = {1,2,3,4};
        int[] second = {5,6,7,8};
        int[] result = add(first, second);
        System.out.println(Arrays.toString(result));
    }
    public static int[] add(int[] firstArray, int[] secondArray) {
        int length = firstArray.length + secondArray.length;
        int result[] = new int[length];
        int k = firstArray.length;
        for (int i=0; i<firstArray.length; i++) {
            result[i] = firstArray[i];
        }
        for (int i=0; i<secondArray.length; i++) {
            result[k] = secondArray[i];
            k++;
        }
        return result;
    }
}