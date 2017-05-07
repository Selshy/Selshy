package Kattis;

import java.util.Scanner;


public class Pot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = 0;
        
        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            b = b + (int)Math.pow((c / 10), c%10); 
        }
        
        System.out.println(b);
    
    
    }
}
