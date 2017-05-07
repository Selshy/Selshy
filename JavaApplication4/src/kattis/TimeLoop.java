package Kattis;

import java.util.Scanner;

public class TimeLoop {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " " + "Abracadabra");
            System.out.println("");
        }
    }
}
