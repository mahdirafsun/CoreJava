package Array;

import java.util.Scanner;

public class TwoDArray {
	
 static Scanner myScanner = new Scanner(System.in);
 
	public static void main(String[] args) {
		String myName; 
		
		myName = new String ("Name"); 
		System.out.println("Please write your name");
		myName = myScanner.nextLine();
		
		//pr(myName);
		//pr(myName.length());
		
		int [] [] twoDArray = new int [3] [4];
		
		twoDArray [0] [0] = 10;
		twoDArray [0] [1] = 20;
		twoDArray [0] [2] = 30;
		twoDArray [0] [3] = (twoDArray [0] [1]  + twoDArray [0] [2]);
		
		twoDArray [1] [0] = 40;
		twoDArray [1] [1] = 50;
		twoDArray [1] [2] = 60;
		twoDArray [1] [3] = (twoDArray [1] [1]  + twoDArray [1] [2]);
		
	
		twoDArray [2] [0] = 70;
		twoDArray [2] [1] = 80;
		twoDArray [2] [2] = 90;
		twoDArray [2] [3] = (twoDArray [2] [1]  + twoDArray [2] [2]);

		System.out.println(twoDArray [0] [3]);
		//pr(twoDArray [1] [3]);
		//pr(twoDArray [2] [3]);
		
		if (myName.length()>8){
			System.out.println("Your name is too long");
		}else if (myName.length()>4){
			System.out.println("your name is too short");
		}else{

			System.out.println("your name is ok ");
			
		}
		
		
		
		
		

	}

}
