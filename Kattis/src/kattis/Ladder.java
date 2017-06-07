package Kattis;

import java.util.Scanner;

public class Ladder {
    
    Scanner scanner = new Scanner (System.in);
    double h, v;
    
    public static void main(String[] args) {
        new Ladder();
    }

    public Ladder() {
        Input();
        System.out.println(length(h, v));
    }
    
    int length(double h, double v) {
        v = Math.toRadians(v);
        int length = (int) Math.ceil( h / Math.sin(v));
        return length;
    }
    
    void Input() {
        h = scanner.nextInt();        
        v = scanner.nextInt();
    }
}