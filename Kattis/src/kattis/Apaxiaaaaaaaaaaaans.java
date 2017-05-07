package Kattis;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String first = scanner.next();
        String second = "";

        char og = ' ';

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != og ) {
                second += first.charAt(i);
            }
            og = first.charAt(i);
        }
        System.out.println(second);
    }
}
