package Kattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseBinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        ArrayList<Character> chars = new ArrayList<>();
        
        for(char c : Integer.toBinaryString(n).toCharArray()) {
            chars.add(c);
        }
        
        Collections.reverse(chars);
        
        String rev = "";
        
        for (char c : chars) {
            rev += Character.toString(c);
        }
        
        
        
        System.out.println(Integer.parseInt(rev, 2));
    }
}
