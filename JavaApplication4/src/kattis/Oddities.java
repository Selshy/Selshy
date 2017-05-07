package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Oddities {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> a = new ArrayList();
        int b = scanner.nextInt();

        for (int i = 0; i< b; i++){
            a.add(scanner.nextInt());
        }
        
        for (int i = 0; i < b; i++) {
            if ( a.get(i)% 2 == 0){             
                System.out.println(a.get(i) + " " + "is even");
            } else {
            System.out.println(a.get(i) + " " + "is odd");
            }
        }
    }
}
