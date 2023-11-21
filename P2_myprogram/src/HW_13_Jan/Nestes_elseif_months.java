// 3) Write a program to print all month name using nested else if

package HW_13_Jan;
import java.util.Scanner;

public class Nestes_elseif_months 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter month of number: ");
		Scanner n = new Scanner(System.in);
		int m = n.nextInt();
		if (12>=m)
		{
			if(1== m)
			{
			System.out.println("January is: "+m);
			}
			else if(2 == m)
			{
				System.out.println("February is: "+m);
			}
			else if(3 == m)
			{
				System.out.println("March is: "+m);
			}
			else if(4 == m)
			{
				System.out.println("April is: "+m);
			}
			else if(5 == m)
			{
				System.out.println("May is: "+m);
			}
			else if(6 == m)
			{
				System.out.println("June is: "+m);
			}
			else if(7 == m)
			{
				System.out.println("July is: "+m);
			}
			else if(8 == m)
			{
				System.out.println("August is: "+m);
			}
			else if(9 == m)
			{
				System.out.println("September is: "+m);
			}
			else if(10 == m)
			{
				System.out.println("Octomber is: "+m);
			}
			else if(11 == m)
			{
				System.out.println("November is: "+m);
			}
			else if(12 == m)
			{
				System.out.println("December is: "+m);
			}
			else if(0 == m)
			{
			System.out.println("Don't allow enter zero number and 1 to 12 Number only. ;-)");
			}
		
		}
		else
		{
		System.out.println("The no found the months");
		}

	}

}
