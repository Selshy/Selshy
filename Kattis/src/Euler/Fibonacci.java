package Euler;

import java.util.ArrayList;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        int Sum = 0;
        int a = 1;
        int b = 2;
        int c;
        
        ArrayList<Integer> value = new ArrayList<>();
        
        for (;;) {
            c = a;
            a = b;
            if(b % 2 == 0){
                value.add(b);
            }
            b += c;
            if(b >= 4000000){
                break;
            }
        }
        for (int i = 0; i < value.size(); i++) {
            Sum += value.get(i);
        }
        System.out.println(Sum);
    }
}
