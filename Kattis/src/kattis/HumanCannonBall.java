package kattis;

import java.util.ArrayList;
import java.util.Scanner;


public class HumanCannonBall {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Float> value = new ArrayList<>();
        
        int N = scanner.nextInt();
        float a = 0;
        double t = 0;
        double y = 0;
        float h1;
        float h2;
        
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                a = scanner.nextFloat();
                value.add(a);
            }
            //t == x/v0 * cos O
            t = value.get(2) / (value.get(0) * Math.cos(value.get(1)));
            //y == v0 * t * sin O - 1/2*g * t**2
            y = value.get(0) * t * Math.sin(value.get(1)) - 0.5*9.81 * Math.pow(t,2);
        
            h1 = value.get(3);
            h2 = value.get(4);
            
            if(h2 - y >= 1 && y - h1 >= 1){
                System.out.println("Safe");
            } else{
                System.out.println("Not Safe");
            }
        }
    }
}