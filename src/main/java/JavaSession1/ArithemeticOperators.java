package JavaSession1;

import java.util.Scanner;

public class ArithemeticOperators {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static float multiply(float a, float b) {
        return a * b;
    }
    static double divide(double a, double b) {
        if (b != 0)
            return (double)a / b;
        else
            return 0;
    }
    static int module(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = 10, val2 = 20;
        System.out.println("Addition: " + add(val1, val2));
        System.out.println("Subtraction: " + subtract(val1, val2));
        System.out.println("Multiplication: " + multiply(val1, val2));
        System.out.println("Division: " + divide(val1, val2));
        System.out.println("Modulo: " + module(val1, val2));
        sc.close();
    }
}
