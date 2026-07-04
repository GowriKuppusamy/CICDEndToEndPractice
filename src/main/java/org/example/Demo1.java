package org.example;

import java.util.Arrays;

public class Demo1 {
    //reverse string
    public void reverse(String input) {
        char[] inputChar = input.toCharArray();
         for (int i = inputChar.length-1; i >=0; i--) {
               System.out.print(inputChar[i]);
         }
    }
    public void sort(String input) {
        StringBuilder sb = new StringBuilder(input);
        System.out.println();
        System.out.println(sb.reverse());


    }
    public void print(String input) {
        System.out.println(input);
    }
    public void findMax(int[] input) {
        Arrays.sort(input);
        System.out.println(input[input.length-1]);

    }

}
