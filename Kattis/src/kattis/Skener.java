package kattis;

import java.util.Scanner;

public class Skener {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int Zr = scanner.nextInt();
        int Zc = scanner.nextInt();
        int RZ;
        int CZ;
        String new_row = "";
        
        for (int i = 0; i < R; i++) {
            String row = scanner.next();
            
            for (int j = 0; j < C; j++) {
                
                for (int k = 0; k < Zc; k++) {
                    new_row += row.charAt(j);
                }
            }
            for (int j = 0; j < Zr; j++) {
                System.out.println(new_row);
            }
            new_row = "";
        }
    }
}
