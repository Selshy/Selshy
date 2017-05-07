package Kattis;

import java.util.Scanner;

public class Autori {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String words = scanner.next();
        String Initialer = "";
        
        for (int i = 0; i < words.length(); i++) {
            if(Character.isUpperCase(words.charAt(i))){
                Initialer += words.charAt(i);
            }
        }
        System.out.println(Initialer);
    }
}
