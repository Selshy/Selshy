package kattis;

import java.util.Scanner;

public class PizzaCrust {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Total radie
        double R = scanner.nextLong();
        //Bredd i centimeter av kant
        double C = scanner.nextLong();
    
        double Tarea = (Math.PI * Math.pow(R, 2));
        double Oarea = (Math.PI * Math.pow((R-C), 2));
        
        System.out.println((Oarea / Tarea) * 100);
    }
}



//total area - ost area == kant area
//Oarea / Tarea