import java.io.*;
import java.util.*;

class Example{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Lab 1");
		
		String userInput = input.nextLine();
		/*
		
		if(userInput.isEmpty())
			System.out.println("No Input");
		else{
			for(int i = 0; i < userInput.length(); i++){
				if(Character.isDigit(userInput.charAt(i)) == true){
					System.out.println("This is not a string");
					break;
				}
				else{
					System.out.println(userInput);
					break;
				}
					
				
			}
		}
			
		*/
		
		///*
		int num = 0;
		num = input.nextInt();
		
		if(!userInput.isEmpty())
			for(int i = 0; i < num; i++)
				System.out.println(userInput);
		else
			System.out.println("No Input");
		//*/
		
	
	
	}
}