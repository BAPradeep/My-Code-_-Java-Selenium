// 20.Write a program to store 10 integers in an array and find the sum of all the elements.

package HW_27_Jan;

public class Integers10_Array_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num = 10,sum=0;
		for (i=1; i<=num; i++) {
			sum=sum+i;
		}
		System.out.println("Sum of 10 integers is : "+sum);

	}

}