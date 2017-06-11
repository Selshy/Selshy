package kattis;

import java.util.Scanner;

public class Fractions {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        for (;;) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            if(a == 0 && b == 0){
                break;
            }
            
            System.out.println(a / b + " " + a % b + " " + "/" + " " + b);
        }
    }
}
