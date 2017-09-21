package kattis;

import java.util.Scanner;

public class Karte {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int P = 13;
        int K = 13;
        int H = 13;
        int T = 13;
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String S = scanner.next();
        
        for (int i = 0; i < 3; i++) {
          a += S.charAt(i);
          b += S.charAt(i+3);
          c += S.charAt(i+6);
          d += S.charAt(i+9);
        }
        
        for (int i = 0; i < 4; i++) {
            if(S.charAt(3*i) == 'P'){
             P--;
            }
            if(S.charAt(3*i) == 'K'){
             K--;
            }
            if(S.charAt(3*i) == 'H'){
             H--;
            }
            if(S.charAt(3*i) == 'T'){
             T--;
            }
        }
        if(a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d)){
            System.out.println("GRESKA");
        }else{
        System.out.println(P + " " + K + " " + H + " " + T);
        }
    }
}