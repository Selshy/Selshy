package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickEstimates {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
        
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            String xD = scanner.next();
            System.out.println(xD.length());
        }
        
    }
}
