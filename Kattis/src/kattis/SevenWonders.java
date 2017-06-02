package kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SevenWonders {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String cards = scanner.next();
        
        ArrayList<Integer> minst = new ArrayList<>();
        
        int T = 0;
        int C = 0;
        int G = 0;
        int n;
        
        // Räknar antal av varje
        for (int i = 0; i < cards.length(); i++) {
            if(cards.charAt(i) == 'T'){
                T++;
            }
            
            if(cards.charAt(i) == 'C'){
                C++;
            }
            
            if(cards.charAt(i) == 'G'){
                G++;
            }
        }
        
        minst.add(T);
        minst.add(C);
        minst.add(G);
        
        Collections.sort(minst);
        
        n = minst.get(0);
        
        System.out.println(T*T + C*C + G*G + 7 * n);
    }
}
