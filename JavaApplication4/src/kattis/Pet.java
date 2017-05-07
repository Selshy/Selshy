package Kattis;

import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
                
        for (int i = 0; i < 4; i++) {
            a += scanner.nextInt();
            
        }
        
        for (int i = 0; i < 4; i++) {
            b += scanner.nextInt();
            
        }
        
        for (int i = 0; i < 4; i++) {
            c += scanner.nextInt();
            
        }
        
        for (int i = 0; i < 4; i++) {
            d += scanner.nextInt();
            
        }
        
        for (int i = 0; i < 4; i++) {
            e += scanner.nextInt();
            
        }
    
        if(a > b){
            if (a > c) {
                if (a > d) {
                    if (a > e) {
                        System.out.println(1 + " " + a);
                    }
                }
            }
        }
        
        if(b > a){
            if (b > c) {
                if (b > d) {
                    if (b > e) {
                        System.out.println(2 + " " + b);
                    }
                }
            }
        }
        
        if(c > a){
            if (c > b) {
                if (c > d) {
                    if (c > e) {
                        System.out.println(3 + " " + c);
                    }
                }
            }
        }
        
        if(d > a){
            if (d > b) {
                if (d > c) {
                    if (d > e) {
                        System.out.println(4 + " " + d);
                    }
                }
            }
        }
        
        if(e > a){
            if (e > b) {
                if (e > c) {
                    if (e > d) {
                        System.out.println(5 + " " + e);
                    }
                }
            }
        }
    }
}
