package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Bela {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int Points = 0;
        char B = scanner.next().charAt(0);
        char A;
        char K;
        char Q;
        char J;
        char T;   
        
        for (int i = 0; i < 4*N; i++) {
            String card = scanner.next();
            if(card.charAt(1) == B){
                if(card.charAt(0) == 'A'){
                    Points += 11;
                }
                if(card.charAt(0) == 'K'){
                    Points += 4;
                }
                if(card.charAt(0) == 'Q'){
                    Points += 3;
                }
                if(card.charAt(0) == 'J'){
                    Points += 20;
                }
                if(card.charAt(0) == 'T'){
                    Points += 10;
                }
                if(card.charAt(0) == '9'){
                    Points += 14;
                }
                if(card.charAt(0) == '8'){
                    Points += 0;
                }
                if(card.charAt(0) == '7'){
                    Points += 0;
                }
            }
            
            if(card.charAt(1) != B){
                if(card.charAt(0) == 'A'){
                    Points += 11;
                }
                if(card.charAt(0) == 'K'){
                    Points += 4;
                }
                if(card.charAt(0) == 'Q'){
                    Points += 3;
                }
                if(card.charAt(0) == 'J'){
                    Points += 2;
                }
                if(card.charAt(0) == 'T'){
                    Points += 10;
                }
                if(card.charAt(0) == '9'){
                    Points += 9;
                }
                if(card.charAt(0) == '8'){
                    Points += 0;
                }
                if(card.charAt(0) == '7'){
                    Points += 0;
                }
            }
        }                
        System.out.println(Points);
    }
}
