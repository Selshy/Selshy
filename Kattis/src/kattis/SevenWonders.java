package kattis;

import java.util.Scanner;

public class SevenWonders {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int T = 0;
        int C = 0;
        int G = 0;
        String cards = scanner.next();
        int points = 0;
        
        for (int i = 0; i < 10; i++) {
            if(cards.charAt(i) == 'T'){
                T++;
            }
            else if(cards.charAt(i) == 'C'){
                C++;
            } else{
                G++;
            }
        }
    }
}
