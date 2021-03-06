import java.util.Scanner;

// Tim Pieniazek - Lab 2

public class Perimeter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		String yes;
		
		System.out.printf("Welcome to Grand Circus' Room Detail Generator!%n");
		
		// Do-While loop repeats the user input process, until they type a character other than "Y" or "y"
		do {				
			System.out.printf("%nEnter Length: ");
			length = scnr.nextDouble();
			
			System.out.print("Enter Width: ");
			width = scnr.nextDouble();
			
			System.out.print("Enter Height: ");
			height = scnr.nextDouble();
			
			area = length * width;
			System.out.println("Area: " + area);
			
			perimeter = 2 * (length + width);
			System.out.println("Perimeter: " + perimeter);
			
			volume = area * height;
			System.out.println("Volume: " + volume);
			
			System.out.printf("%nContinue? (y/n): ");
			yes = scnr.next();
			
		} while (yes.equalsIgnoreCase("y"));

	}

}
