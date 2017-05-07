package Kattis;

import java.util.Scanner;

public class Tri {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = 0;
        
        if(a + b == c && n == 0){
            System.out.println(a + "+" + b + "=" + c);
            n = 1;
        }
        
        if(a == b + c && n == 0){
            System.out.println(a + "=" + b + "+" + c);
            n = 1;
        }
        
        if(a - b == c && n == 0){
            System.out.println(a + "-" + b + "=" + c);
            n = 1;
        }
        
        if(a == b - c && n == 0){
            System.out.println(a + "=" + b + "-" + c);
            n = 1;
        }
        
        if(a / b == c && n == 0){
            System.out.println(a + "/" + b + "=" + c);
            n = 1;
        }
        
        if(a == b / c && n == 0){
            System.out.println(a + "=" + b + "/" + c);
            n = 1;
        }
        
        if(a * b == c && n == 0){
            System.out.println(a + "*" + b + "=" + c);
            n = 1;
        }
        
        if(a == b * c && n == 0){
            System.out.println(a + "=" + b + "*" + c);
            n = 1;
        }
    }
}
