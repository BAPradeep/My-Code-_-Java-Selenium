// Declare 3 variable a =value, b = value and c =value, Display the biggest number

package myprogram;
//import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25, b=315, c=45; //biggest,temp;
		//Scanner haa = new Scanner(System.in);
		
		if((a>b) && (a>c))
		System.out.println("Enter the first number of biggest: "+ a);
		//a = haa.nextInt();
		
		if((b>a) && (b>c))
		System.out.println("Enter the second number of biggest: "+ b);
		//b = haa.nextInt();
		
		if((c>a) && (c>b))
		System.out.println("Enter the three number of biggest: "+ c);
		//c = haa.nextInt();
		
		/*temp = a>b?a:b;
		
		biggest = c>temp?c:temp;
		
		System.out.println("The Biggest number is: " + biggest);
		*/

	}

}
