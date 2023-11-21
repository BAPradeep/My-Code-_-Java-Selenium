//6.Program to input your name, mark1, mark2, mark3 and find total and average and print.

package HW_27_Jan;
import java.util.Scanner;

public class Total_avg_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner all = new Scanner(System.in);
		int mark1,mark2,mark3,total,average;
		
		System.out.println("Enter the number of mark1 : ");
		mark1=all.nextInt();
		
		System.out.println("Enter the number of mark2 : ");
		mark2=all.nextInt();
		
		System.out.println("Enter the number of mark3 : ");
		mark3=all.nextInt();
		
		total =mark1+mark2+mark3;
		System.out.println("Total all number marks of sum : "+total);
		
		average =total/3;
		System.out.println("Average is total/3 : "+average);

	}

}
