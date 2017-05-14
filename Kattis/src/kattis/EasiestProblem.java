package kattis;

import java.util.Scanner;

public class EasiestProblem {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        for (;;) {
            int N = scanner.nextInt();
            
            if(N == 0){
                break;
            }            
            
            for (int p = 11;; p++) {
                int Resultat = N * p;
                if(Nsumma(N) == Nsumma(Resultat)){
                    System.out.println(p);
                    break;
                }
            }
        }
    }

    public static int Nsumma(int N) {
        int num = N;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return(sum);
    }
    
    
}
