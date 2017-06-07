package kattis;

import java.util.Scanner;

public class StackingCups {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        String[] divide;
        String a = "";
        String p1;
        String p2;
        
        
        for (int i = 0; i < N; i++) {
            
            a = "scanner .next()";
            divide = a.split(" ");
            p1 = divide[0];
            p2 = divide[1];
            System.out.println(p1 + p2);
        }
    }
}
