package Kattis;

import java.util.Scanner;

public class Faktor {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int I = scanner.nextInt();
        
        System.out.println(A * (I-1) + 1);
    
    }
}
