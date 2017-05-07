package Kattis;

import java.util.Scanner;

public class Datum {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int D = scanner.nextInt();
        int M = scanner.nextInt();
        
        if( M == 2 || M == 3 || M == 11){
            if(D % 7 == 1){
                System.out.println("Sunday");
            }
            
            if(D % 7 == 2){
                System.out.println("Monday");
            }
            
            if(D % 7 == 3){
                System.out.println("Tuesday");
            }
            
            if(D % 7 == 4){
                System.out.println("Wednesday");
            }
            
            if(D % 7 == 5){
                System.out.println("Thursday");
            }
            
            if(D % 7 == 6){
                System.out.println("Friday");
            }
            
            if(D % 7 == 0){
                System.out.println("Saturday");
            }
        }
        
        if( M == 1 || M == 10){
            if(D % 7 == 1){
                System.out.println("Thursday");
            }
            
            if(D % 7 == 2){
                System.out.println("Friday");
            }
            
            if(D % 7 == 3){
                System.out.println("Saturday");
            }
            
            if(D % 7 == 4){
                System.out.println("Sunday");
            }
            
            if(D % 7 == 5){
                System.out.println("Monday");
            }
            
            if(D % 7 == 6){
                System.out.println("Tuesday");
            }
            
            if(D % 7 == 7){
                System.out.println("Wednesday");
            }
        }
        
        if( M == 4 || M == 7){
            if(D % 7 == 1){
                System.out.println("Wednesday");
            }
            
            if(D % 7 == 2){
                System.out.println("Thursday");
            }
            
            if(D % 7 == 3){
                System.out.println("Friday");
            }
            
            if(D % 7 == 4){
                System.out.println("Saturday");
            }
            
            if(D % 7 == 5){
                System.out.println("Sunday");
            }
            
            if(D % 7 == 6){
                System.out.println("Monday");
            }
            
            if(D % 7 == 7){
                System.out.println("Tuesday");
            }
        }
    
        if( M == 5){
            if(D % 7 == 1){
                System.out.println("Friday");
            }
            
            if(D % 7 == 2){
                System.out.println("Saturday");
            }
            
            if(D % 7 == 3){
                System.out.println("Sunday");
            }
            
            if(D % 7 == 4){
                System.out.println("Monday");
            }
            
            if(D % 7 == 5){
                System.out.println("Tuesday");
            }
            
            if(D % 7 == 6){
                System.out.println("Wednesday");
            }
            
            if(D % 7 == 7){
                System.out.println("Thursday");
            }
        }
        
        if( M == 6){
            if(D % 7 == 1){
                System.out.println("Monday");
            }
            
            if(D % 7 == 2){
                System.out.println("Tuesday");
            }
            
            if(D % 7 == 3){
                System.out.println("Wednesday");
            }
            
            if(D % 7 == 4){
                System.out.println("Thursday");
            }
            
            if(D % 7 == 5){
                System.out.println("Friday");
            }
            
            if(D % 7 == 6){
                System.out.println("Saturday");
            }
            
            if(D % 7 == 7){
                System.out.println("Sunday");
            }
        }
        
        if( M == 8){
            if(D % 7 == 1){
                System.out.println("Saturday");
            }
            
            if(D % 7 == 2){
                System.out.println("Sunday");
            }
            
            if(D % 7 == 3){
                System.out.println("Monday");
            }
            
            if(D % 7 == 4){
                System.out.println("Tuesday");
            }
            
            if(D % 7 == 5){
                System.out.println("Wednesday");
            }
            
            if(D % 7 == 6){
                System.out.println("Thursday");
            }
            
            if(D % 7 == 7){
                System.out.println("Friday");
            }
        }
    
        if( M == 9 || M == 12){
            if(D % 7 == 1){
                System.out.println("Tuesday");
            }
            
            if(D % 7 == 2){
                System.out.println("Wednesday");
            }
            
            if(D % 7 == 3){
                System.out.println("Thursday");
            }
            
            if(D % 7 == 4){
                System.out.println("Friday");
            }
            
            if(D % 7 == 5){
                System.out.println("Saturday");
            }
            
            if(D % 7 == 6){
                System.out.println("Sunday");
            }
            
            if(D % 7 == 7){
                System.out.println("Monday");
            }
        }
    }
}
