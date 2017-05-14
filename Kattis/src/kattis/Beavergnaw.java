package kattis;

import java.util.Scanner;

public class Beavergnaw {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        for(;;) {
            double D = scanner.nextDouble();
            double V = scanner.nextDouble();


            if (D == 0 && V == 0){
                break;
            }

            System.out.println(Math.cbrt( (((-6) * V) / Math.PI) + (D*D*D)));
        }
    }
}