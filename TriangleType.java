/*
 Tvisha Gupta
 TriangleType.java
 11/6/20
 Prints out whether a triangle is acute, obtuse, or right
 */
 
import java.util.Scanner;
 
public class TriangleType
{
	Scanner tvisha1;
	double hypotenuse;
	double side1;
	double side2;
	double side3;
	double notHypotenuse1;
	double notHypotenuse2;
	double triangleArea;
	double semiPerimeter;
	String triangleType;
	
	public TriangleType()
	{
		tvisha1 = new Scanner(System.in);
		hypotenuse = 0.0;
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
		notHypotenuse1 = 0.0;
		notHypotenuse2 = 0.0;
		triangleArea = 0.0;
		semiPerimeter = 0.0;
		triangleType = "";
	}
	
	public static void main(String[] args)
	{
		TriangleType tvisha = new TriangleType();
		tvisha.askInput();
	}

	public void askInput()
	{
		System.out.println("\n\n\nPlease enter your 3 sides of a triangle: ");
		side1 = tvisha1.nextDouble();
		side2 = tvisha1.nextDouble();
		side3 = tvisha1.nextDouble();
		
		
		if(side1<0 || side2<0 || side3<0)
			{
				while(side1<0 || side2<0 || side3<0)
				{
					System.out.println("\nNegative input, please enter your 3 sides of a triangle");
					side1 = tvisha1.nextDouble();
					side2 = tvisha1.nextDouble();
					side3 = tvisha1.nextDouble();
				}
				nextSteps();
			}
		else if(side1+side2<side3 || side1+side3<side2 || side2+side3<side1)
		{
			System.out.println("Not a real triangle. \n\n\n");
		}
		
		else
		{
			nextSteps();
		}
	}
	
	public void nextSteps()
	{
		determineHypotenuse();
		determineTriangleType();
		determineTriangleArea();
		printOutput();
	}
		
	public void determineHypotenuse()
	{
		hypotenuse = side3;
		notHypotenuse1 = side1;
		notHypotenuse2 = side2;
		if(side2>hypotenuse)
		{
			hypotenuse = side2;
			if(side1>side3)
			{
				notHypotenuse1 = side3;
				notHypotenuse2 = side1;
			}
			
			else
			{
				notHypotenuse1 = side1;
				notHypotenuse2 = side3;
			}
		}
		
		if(side1>hypotenuse)
		{
			hypotenuse = side1;
			
			if(side2>side3)
			{
				notHypotenuse1 = side3;
				notHypotenuse2 = side2;
			}
			
			else
			{
				notHypotenuse1 = side2;
				notHypotenuse2 = side3;
			}
		}
	}
	
	public void determineTriangleType()
	{
		
		if((Math.pow(notHypotenuse1, 2))+(Math.pow(notHypotenuse2, 2)) < (Math.pow(hypotenuse, 2)))
		{
			triangleType = "obtuse";
		}
		
		else if((Math.pow(notHypotenuse1, 2))+(Math.pow(notHypotenuse2, 2)) > (Math.pow(hypotenuse, 2)))
		{
			triangleType = "acute";
		}
		
		else if((Math.pow(notHypotenuse1, 2))+(Math.pow(notHypotenuse2, 2)) == (Math.pow(hypotenuse, 2)))
		{
			triangleType = "right";
		}
	}
	
	public void determineTriangleArea()
	{
		semiPerimeter = ((side1+side2+side3)/2);
		double tempVal = ((semiPerimeter*(semiPerimeter-side1))*(semiPerimeter-side2)*(semiPerimeter-side3));
		triangleArea = Math.sqrt(tempVal);
	}
	
	public void printOutput()
	{
		if(triangleType.equals("obtuse"))
		{
			System.out.printf("\n%.1f^2 + %.1f^2 < %.1f^2\n", notHypotenuse1, notHypotenuse2, hypotenuse);
			System.out.println("Your triangle is obtuse!");
		}
		
		else if(triangleType.equals("acute"))
		{
			System.out.printf("\n%.1f^2 + %.1f^2 > %.1f^2\n", notHypotenuse1, notHypotenuse2, hypotenuse);
			System.out.println("Your triangle is actue!");
		}
		
		else if(triangleType.equals("right"))
		{
			System.out.printf("\n%.1f^2 + %.1f^2 = %.1f^2\n", notHypotenuse1, notHypotenuse2, hypotenuse);
			System.out.println("Your triangle is right!");
		}
		
		System.out.printf("The area is %.2f \n\n\n\n", triangleArea);
	}
}
