package Kattis;

import java.util.Scanner;

public class Spavanac {
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 45;
        
        if(b-c >= 0){
            System.out.println(a + " " + (b-c));
        }
        
        if(b-c >= 0 && b-c >= 10){
            System.out.println(a + " " + (b-c));
        }
            
        if(b-c < 0 && a-1 >= 0){
            System.out.println((a-1) + " " + (60 - (-1*(b-c))));        
        }
        
        if(a-1 < 0 && b-c >= 0){            
            System.out.println((24-(-1*(a-1))) + " " + (b-c));
        }
        
        if(a-1 < 0 && b-c < 0){
            System.out.println((24-(-1*(a-1))) + " " + (60 - (-1*(b-c))));
        }
    }
}
