package challenge;

import java.util.Scanner;

public class ArrayChallenges {

	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void resizeArray() {
		int[] baseData = readElements(6);
		printArray(baseData);
		
		int[] original = baseData;	
		baseData = new int[10];
		baseData = readElements(10);
		printArray(baseData);
	}
	
	private static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
	
	public static void reverse(int par) {
		int[] array = readElements(par);
		//read elements
	 // 1,2,3,4,5  => 5,4,3,2,1
		
		int maxIndex = array.length-1;
		int halfLenght = array.length/2;
		
		for (int i=0; i<halfLenght; i++) {
			
			int temp = array[i];
			array[i] = array[maxIndex-i];
			array[maxIndex]=temp;
		}
	}
	
	public static int[] readElements(int count) {
		
		int[] array = new int[count];

		System.out.println("Enter "+count+" numbers:" );
		for(int i=0; i<count; i++) {
			array[i]=scanner.nextInt();
			scanner.nextLine();
		}
		return array; 
	}
}
