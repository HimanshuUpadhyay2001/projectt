package element;

import java.util.Arrays;

public class Arrayyyy {

	public static int getSecondSmallest(int[] a, int total)
	{  
		Arrays.sort(a);  
		return a[1];  
		} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,8,7,5,9,4,8,};  
		System.out.println("Second Smallest element is : "+getSecondSmallest(a,8));  

	}

}
