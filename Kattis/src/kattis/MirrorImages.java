package kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MirrorImages {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList <Character> rev = new ArrayList<>();
        ArrayList <String> order = new ArrayList<>();
        
        int T = scanner.nextInt();
        
        String klar = "";
        
        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            int C = scanner.nextInt();
            
            //skriver ut Test
            System.out.println("Test" + " " + (i + 1));
            
            //Lägger till rad i ArrayList och roterar den
            for (int j = 0; j < R; j++) {
                String x = scanner.next();
                
                for (int k = 0; k < x.length(); k++) {
                    rev.add(x.charAt(k));
                }
                
                Collections.reverse(rev);
            //Gör till strings och tömmer allt som ska tömmas
                for (char a : rev) {
                    klar += Character.toString(a);
                }                
                order.add(klar);
                klar = "";
                rev.clear();
            }
            //fixar ordningen det ska printas i
            Collections.reverse(order);
            for (int j = 0; j < R; j++) {
                System.out.println(order.get(j));
            }
            //tömmer ordningen
            order.clear();
        }
    }
}
