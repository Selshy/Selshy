package Kattis;

import java.util.Scanner;

public class Cryptographer {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        
        
        int n = 0;
        
        for (int i = 0; i < input.length(); i++) {
            
            if(i % 3 == 0){
                if(input.charAt(i) != 'P'){
                    n++;
                }
            }
            
            if(i % 3 == 1){
                if(input.charAt(i) != 'E'){
                    n++;
                }
            }
        
            if(i % 3 == 2) {
                if(input.charAt(i) != 'R'){
                    n++;
                }
            }            
        }        
        System.out.println(n);
    }
}
