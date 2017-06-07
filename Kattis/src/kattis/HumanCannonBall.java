package kattis;

import java.util.ArrayList;
import java.util.Scanner;


public class HumanCannonBall {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Float> value = new ArrayList<>();
        
        int N = scanner.nextInt();
        double t;
        double y;
        double v;
        double h1;
        double h2;
        double O;
        double x;
        
        for (int i = 0; i < N; i++) {
            
            v = scanner.nextDouble();
            O = Math.toRadians(scanner.nextDouble());
            x = scanner.nextDouble();
            h1 = scanner.nextDouble();
            h2 = scanner.nextDouble();
            
            //t == x/v0 * cos O
            t = x / (v * Math.cos(O));
            //y == v0 * t * sin O - 1/2*g * t**2
            y = v * t * Math.sin(O) - (0.5*9.81 * t*t);
        
            
            if((y > h1 + 1) && y < (h2 - 1)){
                System.out.println("Safe");
            } else{
                System.out.println("Not Safe");
            }
        }
    }
}