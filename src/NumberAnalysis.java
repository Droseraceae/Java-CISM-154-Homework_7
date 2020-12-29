import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Create a program that reads the numbers in Numbers.txt into an array.
 * 
 * Numbers.txt has been included in the HW7 BlueJ folder.
 * 
 * Use that array to determine:
 * The smallest number.
 * The largest number.
 * The sum of all of the numbers.
 * The average of the numbers.
 * 
 * HINT:
 * Your array should have enough space to hold 100 elements 
 * 
 * @author Josh Alcoba
 */
public class NumberAnalysis {

	public static void main(String[] args) throws IOException {
		
		
		Scanner fileReader = new Scanner(new File("Numbers.txt"));
		int[] arr = new int[100];
		int lineNum = 0;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int sum = 0;

		while (fileReader.hasNextLine()) {
			arr[lineNum] = Integer.parseInt(fileReader.nextLine());
			if (arr[lineNum] > largest)
				largest = arr[lineNum];
			if (arr[lineNum] < smallest)
				smallest = arr[lineNum];
			sum += arr[lineNum];
			lineNum++;
		}
		
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The largest number is: " + largest);
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + sum/100);
		
		fileReader.close();

	}

}
