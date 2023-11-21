// write a program to all all number in the given array[]
package Interview;

import java.util.Arrays;

public class all_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array[]
	
		int a[] = {10,20,30,40,50};// an elements 
//		int sum1 = Arrays.stream(a).sum();
//		System.out.println(sum1);
		
//		with loop
		int sum =0;
		for(int i=0; i<a.length; i++) //
		sum +=a[i]; // sum = sum+a[i];  // a[0] output = 10
		System.out.println(sum);
		}
}