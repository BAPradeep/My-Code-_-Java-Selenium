/* 2) Program to input your name, mark1, mark2, mark3 and find
 * total and average and print
 */

package HW_13_Jan;
import java.util.Scanner;
public class total_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark1,mark2,mark3;
		Scanner one = new Scanner(System.in);
		System.out.println("Enter all number: ");
		mark1 = one.nextInt();
		mark2 = one.nextInt();
		mark3 = one.nextInt();
		System.out.println(
				"Enter the Number of mark1: "+mark1 +"\n"+
				"Enter the Number of mark2: "+mark2 +"\n"+
				"Enter the Number of mark3: "+mark3
						  );
		System.out.println("all marks to total: "+(mark1+mark2+mark3));
		System.out.println("average (total/how many mark): "+(mark1+mark2+mark3)/3);

	}

}
