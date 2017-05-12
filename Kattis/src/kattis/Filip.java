package kattis;

import java.util.Scanner;

public class Filip {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.next();
        String B = scanner.next();
        String Ab = "";
        String Ba = "";
        
        for (int i = 2; i >= 0; i--) {
            Ab += A.charAt(i);
        }
        for (int i = 2; i >= 0; i--) {
            Ba += B.charAt(i);
        }
        int As = Integer.parseInt(Ab);
        int Bs = Integer.parseInt(Ba);
        
        if(As > Bs){
            System.out.println(As);
        } else if(As < Bs){
            System.out.println(Bs);
        }
        
    }
}
