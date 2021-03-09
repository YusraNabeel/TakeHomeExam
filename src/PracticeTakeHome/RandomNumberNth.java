package PracticeTakeHome;


import java.util.Random;
//Generate 500 random numbers and print the nth smallest number in a
//programming language of your choice.
//(Ask user for the Nth smallest number)
import java.util.Scanner;

public class RandomNumberNth {

	public static void main(String[] args) {

		int start=0;  // this is my start point for numbers
		int n=0; // This is initial value of n and later it incremented as n++ and initialized as variable 'a' 
		int end = 500; //end point of numbers
		int arraysize = end - start; // this defines the array size, basically of 500 random numbers
		
		int numbers[] = new int[arraysize + 1]; //Declaring integer array for variable 'numbers' equal to new integer[size of array +1]
		
		Random randomnum = new Random();
		System.out.println("Random Numbers");
		for (int count = start; count <= end; count++) { //here end is representing we only need 500 numbers
			int a = n++;
			int num = randomnum.nextInt(500); //nextint will generate numbers in next line.0-499 it will print
			numbers[a] = num;
			System.out.println(numbers[a]);

		}
		Scanner scan = new Scanner(System.in);
		
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++)
		{

		 if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		smallest = scan.nextInt();

		System.out.println("Smallest nth Number is : " + smallest);
		
	}
}