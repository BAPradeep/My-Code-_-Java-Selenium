package HW_27_Jan;
import java.util.Scanner;

public class Months_Switch_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Month of Numbe is: ");
		Scanner b = new Scanner(System.in);
		int a =b.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("January of month is: "+a);
			break;
		case 2:
			System.out.println("February of month is: "+a);
			break;
		case 3:
			System.out.println("March of month is: "+a);
			break;
		case 4:
			System.out.println("April of month is: "+a);
			break;
		case 5:
			System.out.println("May of month is: "+a);
			break;
		case 6:
			System.out.println("June of month is: "+a);
			break;
		case 7:
			System.out.println("July of month is: "+a);
			break;
		case 8:
			System.out.println("August of month is: "+a);
			break;
		case 9:
			System.out.println("October of month is: "+a);
			break;
		case 10:
			System.out.println("September of month is: "+a);
			break;
		case 11:
			System.out.println("November of month is: "+a);
			break;
		case 12:
			System.out.println("December of month is: "+a);
			break;
		default:
			System.out.println("Dont found month and number of 1 to 12 only. ;-)");
		}

		

	}

}
