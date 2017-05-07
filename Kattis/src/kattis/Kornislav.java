package Kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kornislav {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> List = new ArrayList();
        
        for (int i = 0; i < 4; i++) {
            List.add(scanner.nextInt());
        }
        
        Collections.sort(List);
        System.out.println((List.get(2)*List.get(0)));
    }
}
