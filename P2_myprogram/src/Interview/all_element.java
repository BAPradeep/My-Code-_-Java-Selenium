package Interview;

import java.util.Arrays;

public class all_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,40};
//		int sum1 = Arrays.stream(a).sum();
//		System.out.println(sum1);
//		
		int sum =0;
		for(int i=0; i<a.length; i++)
			sum +=a[i];
		System.out.println(sum);
		}
}