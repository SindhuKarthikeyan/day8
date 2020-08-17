package day8;

import java.util.Arrays;

public class LargestAndSmallestOfArray {

	public static void main(String[] args) {

		 int[] arr = new int[]{ 1,26,3,4,5,6,72,8,9,10 }; 
		 for (int i = 0; i < arr.length; i++)
			  System.out.println("Element at index " + i + 
			                                " : "+ arr[i]);
		   Arrays.sort(arr); 
		  
	        System.out.printf("Modified arr[] : %s", 
	                          Arrays.toString(arr)); 
System.out.println("");
 System.out.println("The Smallest no.in Array: "+arr[0]);
 System.out.println("The Largest no.in Array: "+arr[arr.length-1]);
	}

}
