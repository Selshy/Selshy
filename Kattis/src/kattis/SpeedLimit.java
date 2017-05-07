package Kattis;

import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            
            int T = 0;
            int a = scanner.nextInt();
            
            if (a == -1) {
                break;
            }

            int total = 0;
            
            for (int j = 0; j < a; j++) {
                int s = scanner.nextInt();
                int t = scanner.nextInt();
                total += (s * (t - T));
                T = t;
            }
            System.out.println(total + " miles");        
        }
    }
}
