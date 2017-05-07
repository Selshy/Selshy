package Kattis;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GrassSeed {
    
    
    
    private static double C, L, width, length, area;
    
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        
        C = scanner.nextDouble();
        L = scanner.nextDouble();
        
        for (int i = 0; i < L; i++) {
            width = scanner.nextDouble();
            length = scanner.nextDouble();
            area += (width * length);
            
        }
        area *= C;
        
        System.out.println(String.format(Locale.US, "%.7f", area));
    }
}
