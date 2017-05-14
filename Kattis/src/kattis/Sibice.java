package kattis;

import java.util.Scanner;

public class Sibice {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        
        W = W*W;
        H = H*H;
        
        for (int i = 0; i < N; i++) {
            
            int L = scanner.nextInt();
            if(L <= Math.sqrt(W + H)){
                System.out.println("DA");
            } else if (L > Math.sqrt(W + H)){
                System.out.println("NE");
            }
        }
        
    }
}
