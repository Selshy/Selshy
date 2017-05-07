package Kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SymmetricOrder {
	
    public static String[] FuckThis(String[] unsorted){

	boolean Fuck = true;
        
        ArrayList<String> Name1 = new ArrayList<String>();
	ArrayList<String> Name2 = new ArrayList<String>();
	
		

	for(int i = 0; i < unsorted.length; i++){
            if(Fuck){
                Fuck = false;
		Name1.add(unsorted[i]);
            }
            else{
                Fuck = true;
		Name2.add(unsorted[i]);
            }
	}

	Collections.reverse(Name2);
	Name1.addAll(Name2);
		
	String[] Listskit = new String[Name1.size()];
	Name1.toArray(Listskit);
		
	return Listskit;
    }
	
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	int number = Integer.parseInt(scanner.nextLine());
		
	ArrayList<String[]> Shit = new ArrayList<String[]>();
		
	while(number != 0){
            String[] input = new String[number];
			
            for(int i = 0; i < number; i++){
                input[i] = scanner.nextLine();
            }
			
            Shit.add(FuckThis(input));
            number = Integer.parseInt(scanner.nextLine());
	}
		
	for(int j = 0; j < Shit.size(); j++){
            System.out.println("SET " + (j+1));
            
            for(int i = 0; i < Shit.get(j).length; i++){
                System.out.println(Shit.get(j)[i]);
            }
	} 		
    }
}