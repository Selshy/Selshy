package Kattis;

import java.util.Scanner;

public class Zamka {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int L = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();
        int Max = 0;
        int Min = 0;
        
        for (int i = L; i <= D; i++) {            
            if(TotSumma(i) == X){
                Min = i;
                break;
            }
        }
        
        for (int i = D; L <= i; i--) {
            if(TotSumma(i) == X){
                Max = i;
                break;
            }
        }
    
        System.out.println(Min);
        System.out.println(Max);
    }
    
    public static int TotSumma(int xD) {
        int Summa = 0;
        
        while(xD != 0){
            Summa += (xD % 10);
            xD /= 10;
        }
        return Summa;
    }
}