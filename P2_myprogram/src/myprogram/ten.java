//write a program to input your name,mark1, mark2 and mark3 and find total and average and print


package myprogram;
import java.util.*;

public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark1,mark2,mark3;
		String name;
		//String name = "Pradeep B A";
		
		Scanner first = new Scanner (System.in);
		System.out.println("Enter name: ");
		name = first.nextLine();
		System.out.println("Enter all number: ");
		mark1 = first.nextInt();
		mark2 = first.nextInt();
		mark3 = first.nextInt();
		System.out.println("Enter is Name = "+name);
		System.out.println("Enter is number of mark1 = "+mark1);
		System.out.println("Enter is number of mark2 = "+mark2);
		System.out.println("Enter is number of mark3 = "+mark3);
		//System.out.println(name + "\n" + mark1 + "\n" + mark2 + "\n" + mark3 );
		System.out.println("Total: "+ (mark1+mark2+mark3));
		System.out.println("Average: "+ (mark1+mark2+mark3)/3 +"%");
		

	}

}
