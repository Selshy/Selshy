package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Zanzibar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> List = new ArrayList();
        
        int T  = scanner.nextInt();
        int value = 0;
        
        for (int i = 0; i < T; i++) {
            for (int j = 1; j < 10000000; j++) {
                
                int a = scanner.nextInt();
                
                if(a == 0){
                    break;
                }
                List.add(a);
            }
            
            for (int j = 1; j < List.size(); j++) {
                if(List.get(j) > 2*(List.get(j-1))){
                    value += List.get(j) - 2*List.get(j-1);
                }
            }
            System.out.println(value);
            List.clear();
            value = 0;
        }
    }
}
