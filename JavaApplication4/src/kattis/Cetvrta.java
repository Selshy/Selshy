package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrta {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> list1 = new ArrayList();
        ArrayList <Integer> list2 = new ArrayList();
    
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        
        if(x1 == x2){
            System.out.print(x3);
        } else if(x1 == x3){
            System.out.print(x2);
        } else if(x2 == x3){
            System.out.print(x1);
        }

        System.out.print(" ");
        
        if(y1 == y2){
            System.out.println(y3);
        } else if(y1 == y3){
            System.out.println(y2);
        } else if(y2 == y3){
            System.out.println(y1);
        }
        
        System.out.println("");
    }
}
