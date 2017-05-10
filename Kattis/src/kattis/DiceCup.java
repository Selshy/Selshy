package kattis;

import java.util.Scanner;

public class DiceCup {
    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        if (N == M) {
            System.out.println(N+1);
        }else if(N < M){        
            for (int i = N+1; i < M+2; i++) {
                System.out.println(i);                
            }
        }else if(N > M){
            for (int i = M+1; i < N+2; i++) {
                System.out.println(i);
            }
        }
    }
}
