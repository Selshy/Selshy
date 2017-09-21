package kattis;

import java.util.Scanner;

public class Planina {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        double A;
        
        A = Math.pow(2,N) + 1;
        
        System.out.println((int) Math.pow(A, 2));
    }
}
