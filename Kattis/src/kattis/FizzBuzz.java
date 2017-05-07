package Kattis;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        boolean banan = false;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        for (int i = 1; i <= c; i++) {
            if (i % a == 0) {
                System.out.print("Fizz");
                banan = true;
            }
            if (i % b == 0) {
                System.out.print("Buzz");
                banan = true;
            }
            if (banan == true) {
                System.out.println("");
            } else {
                System.out.println("" + i);
            }
            banan = false;
        }
    }
}
