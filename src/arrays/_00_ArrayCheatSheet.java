package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int f;
	static int g;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] girlfriends = {"Angelina Jolie", "Katherine McNarma", "Julia Roberts", "Rosy", "Baby"};
		//2. print the third element in the array
		System.out.println(girlfriends[2]);
		//3. set the third element to a different value
		girlfriends[2] = "Mia";
		//4. print the third element again
		System.out.println(girlfriends[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i <girlfriends.length;i++) {
			System.out.println(girlfriends[i]);
		}
		
		//6. make an array of 50 integers
		int[] x = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < x.length; i++)  {
			x[i] = new Random().nextInt(1000);
		}
		f = x[0];
		for (int i = 1; i < x.length; i++) {
			if (f>=x[i]) {
				f = x[i];
			}
		}
		System.out.println(f);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		g = x[0];
		for (int i = 1; i < x.length; i++) {
			if (g<=x[i]) {
				g = x[i];
			}
		}
		System.out.println(g);
		
		
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
