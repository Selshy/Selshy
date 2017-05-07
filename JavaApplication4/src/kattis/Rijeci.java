package Kattis;

import java.util.Scanner;


public class Rijeci {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        fib(n);

        System.out.println(fib(n - 1) + " " + fib(n));
    }

    static int fib(int n) {
        int a = 0;
        int b = 1;
        
        for(int i = 0; i < n; i++) {            
            int ta = a;
            
            a = b;
            b = ta + b;
        }
        
        return a;
    }
}
