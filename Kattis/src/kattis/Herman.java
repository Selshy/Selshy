package kattis;

import java.util.Scanner;

public class Herman {
    
    Scanner scanner = new Scanner(System.in);
    
    double N;
    
    public static void main(String[] args) {
        
        new Herman();
        
    }
    
    public Herman(){
        Input();
        System.out.println(Normal(N));
        System.out.println(Taxi(N));
    }
    
    double Normal(double N){
        double Nrad = Math.PI * Math.pow(N,2);
        return Nrad;
    }
    
    double Taxi(double N){
        double Trad = (Math.pow(N * 2, 2))/2;
        return Trad;
    }
    
    void Input(){
        N = scanner.nextInt();
    }
    
}
