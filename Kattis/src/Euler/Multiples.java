package Euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Multiples {
    
    public static void main(String[] args) {
        
        ArrayList <Integer> value = new ArrayList<>();
        
        
        int T = 3;
        int F = 5;
        int Sum = 0;
        int Prod = 0;
        
        for (int i = 1; i < 1000; i++) {
            Prod = 3 * i;
            if(Prod < 1000){
                value.add(Prod);
            }
            Prod = 5 * i;
            if(Prod < 1000){
                value.add(Prod);
            }
        }
        
        HashSet <Integer> unique = new HashSet<>(value);
        ArrayList <Integer> uniqueList = new ArrayList<>(unique);
        
        for (int i = 0; i < uniqueList.size(); i++) {
            Sum += uniqueList.get(i);
        }
        System.out.println(Sum);
    }
}
