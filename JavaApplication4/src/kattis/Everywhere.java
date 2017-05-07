package Kattis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Everywhere {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashSet <String> list = new HashSet <String>();
        
        
        int a = scanner.nextInt();
        
        for (int i = 0; i < a; i++) {
            
            int b = scanner.nextInt();
            
            for (int j = 0; j < b; j++) {
                String c = scanner.next();
                list.add(c);
            }
            
            HashSet <String> uniquelist = new HashSet <String>(list);
            
            System.out.println(uniquelist.size());
        
            list.clear();
            uniquelist.clear();
            
        }
    }    
}
