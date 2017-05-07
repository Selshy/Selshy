package Kattis;

import java.util.Scanner;


public class Trik {
    
    static int P = 1;
    
    public static void main(String[] args) {        
        
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                if (P == 2) {
                    P=1;
                }
                else if (P == 1) {
                    P = 2;
                }
            
            }
            if(s.charAt(i) == 'B'){
                if (P == 3) {
                    P = 2;
                }
                else if(P == 2) {
                    P = 3;
                }            
            }
            if(s.charAt(i) == 'C'){
                if (P == 1) {
                    P = 3;
                }
                else if(P == 3) {
                    P = 1;
                }
            }
        }
        System.out.println(P);
    }
}
