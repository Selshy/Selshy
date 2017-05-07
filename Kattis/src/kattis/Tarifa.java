package Kattis;

import java.util.Scanner;

public class Tarifa {
    
    static int Pi = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        
        int F = 0;
        
        for (int i = 0; i < N; i++) {
            int P = scanner.nextInt();
            F = F + (X - P);
        }
            F = F + X;
        System.out.println(F);
    }
}
