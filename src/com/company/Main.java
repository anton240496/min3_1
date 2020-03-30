package com.company;
import java.util.Scanner;

import org.junit.Test;

public class Main {
    @Test
    public static void main(String[] args) {

        System.out.println(min(45,78,96));
        System.out.println(min(45,7,96));
        System.out.println(min(45,78,6));
        System.out.println(min(45,-78,96));
        System.out.println(min(45,-78,-96));
        Scanner scnr = new Scanner(System.in);
        System.out.println("введите три числа");
        System.out.println(min( scnr.nextInt(), scnr.nextInt(), scnr.nextInt()));

    }

    private static int min(int a, int b, int c){

    int min;
     min =Math.min(a, Math.min(b, c));
        return min;
    }
}
