package org.example;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type first no: ");
        int first = sc.nextInt();
        System.out.println("Type second no: ");
        int second = sc.nextInt();

        System.out.println("addition: " + first + second);
        System.out.println("subtraction: " + (first - second));
        System.out.println("multiplication: " + first * second);
        System.out.println("division: " + first / second);
        System.out.println("modulo: " + first % second);

    }
}
