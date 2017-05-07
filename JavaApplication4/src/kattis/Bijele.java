package Kattis;

import java.util.Scanner;


public class Bijele {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Ki = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();
        int B = scanner.nextInt();
        int Kn = scanner.nextInt();
        int P = scanner.nextInt();
        
        if(Ki != 1){
            Ki = 1 - Ki;
        }else{
            Ki = 0;
        }
        
        if(Q != 1){
            Q = 1 - Q;
        }else{
            Q = 0;
        }
        
        if(R != 2){
            R = 2 - R;
        }else{
            R = 0;
        }
        
        if(B != 2){
            B = 2 - B;
        }else{
            B = 0;
        }
        
        if(Kn != 2){
            Kn = 2 - Kn;
        }else{
            Kn = 0;
        }
        
        if(P != 8){
            P = 8 - P;
        }else{
            P = 0;
        }

        System.out.print(Ki + " " + Q + " " + R + " " + B + " " + Kn + " " + P);
    }
}
