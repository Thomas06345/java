/* 
 * Name - Thomas Cherian
 * Date - 19/08/25
 * Purpose - To create and display arrays
 */

import java.util.Scanner;

public class ArrayDemo {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("the given array is: ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
		int largest = array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>largest) {
				largest = array[i];
			}
		}
		System.out.println("\nthe largest element in the array is: "+ largest);
	}
}
