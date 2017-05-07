package Kattis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Modulo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int a;
                
        for (int i = 0; i < 10; i++) {
            a = scanner.nextInt();
            list.add(a % 42);
        }
        
        ArrayList<Integer> uniquelist = new ArrayList<Integer>(list);
    
        System.out.println(uniquelist.size());
    }
}
