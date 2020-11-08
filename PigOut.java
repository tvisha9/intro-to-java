/*
 put comments
 */

import java.util.Scanner;



public class PigOut extends BuckleMyShoe
{
	public static void main(String[] args)
	{
		PigOut tvisha1 = new PigOut();
		tvisha1.runDecider();
	}
	
	
	public void runDecider()
	{
		System.out.print("\n\n\nWould you like to run PigOut(1) or BuckleMyShoe(2)? ");
		
		int programChooser = tvisha.nextInt();
		
		if(programChooser == 1)
		{
			runPigOut();
		}
		
		else
		{
			
			runBuckleMyShoe();
		}
	}
	
	public void runPigOut()
	{
		String foodInput = "";
		int nomCounter = 0;
		int wordLength = 0;
		tvisha.nextLine(); //you need this nextLine() here because otherwise, after you input the number for the program choice, the nextLine take the carriage return as the input
		//and then runs the while loop over again, which is why it prints out the 
		System.out.print("\n");
		while(!foodInput.equalsIgnoreCase("I'm full"))
		{
			System.out.print("What food would you like to eat? (Type \"I'm full\" to terminate) --> ");
			foodInput = tvisha.nextLine();
			System.out.print("\n");
			
			if(foodInput.equalsIgnoreCase("I'm full"))
			{
				System.out.print("\n\n");
			}
			
			else
			{
				
				wordLength = foodInput.length();
				for(int i = 1; i <= wordLength; i++)
				{
					System.out.print("Nom ");
					nomCounter+=1;
					
					if(nomCounter == 5)
					{
						System.out.print("burp\n\n");
						nomCounter = 0;
					}
					
					else if(i == wordLength)
					{
						System.out.println("\n");
					}
				}
			}
		}
	}
}



class BuckleMyShoe
{
	Scanner tvisha;
	
	public BuckleMyShoe()
	{
		tvisha = new Scanner(System.in);
	}
	
	public void runBuckleMyShoe()
	{
		int numInFront = 1;
		System.out.print("\nPlease enter an integer from 1 to 10: ");
		int buckleMyShoeNum = tvisha.nextInt();
		
		while(buckleMyShoeNum>10 || buckleMyShoeNum<1)
		{
			System.out.println("\nSorry, inappropriate input.");
			System.out.print("\nPlease enter an integer from 1 to 10: ");
			buckleMyShoeNum = tvisha.nextInt();
		}
		
		if(buckleMyShoeNum == 1 || buckleMyShoeNum == 2)
		{
			for(int i = 1; i<=buckleMyShoeNum; i++)
			{
				System.out.println(i + ". " + "1, 2 Buckle my shoe");
				
			}
		}
		
		else if(buckleMyShoeNum == 3 || buckleMyShoeNum == 4)
		{
			for(int i = 1; i<=buckleMyShoeNum; i++)
			{
				System.out.println(i + ". " + "3, 4 Shut the door");
				
			}
		}
		
		else if(buckleMyShoeNum == 5 || buckleMyShoeNum == 6)
		{
			for(int i = 1; i<=buckleMyShoeNum; i++)
			{
				System.out.println(i + ". " + "5, 6 Pick up sticks");
				
			}
		}
		
		else if(buckleMyShoeNum == 7 || buckleMyShoeNum == 8)
		{
			for(int i = 1; i<=buckleMyShoeNum; i++)
			{
				System.out.println(i + ". " + "7, 8 Lay them straight");
				
			}
		}
		
		else if(buckleMyShoeNum == 9 || buckleMyShoeNum == 10)
		{
			for(int i = 1; i<=buckleMyShoeNum; i++)
			{
				System.out.println(i + ". " + "9, 10 A big fat hen");
				
			}
		}
		
		System.out.println("\n\n");
	}
}



