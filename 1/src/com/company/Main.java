package com.company;

public class Main {

    public static void main(String[] args) {
       int[] numbers = {2, 5, 7, 8, 3, 0, 5, 6, 2, 1};
       for(int i = 0; i < numbers.length; i++) {
           if((numbers[i] % 2) == 0){
               System.out.println("Even = " + numbers[i]);
           }
           else {
               System.out.println("Odd = " + numbers[i]);
           }
       }
    }
}
