// 4.Write a program to calculate the area & perimeter of square and rectangle. (Square  Area=a*a, Perimeter= 4*a.   Rectangle  Area =   l*b, Perimeter= 2*(l+b))

package HW_27_Jan;
import java.util.Scanner;
public class Area_perimeter_04 {
	public static void main (String[] arg) {
		
		int a,b,l,A1,A2,P1,P2;
		Scanner cal = new Scanner(System.in);
		System.out.println("Enter is numbers : ");
		a=cal.nextInt();
		b=cal.nextInt();
		l=cal.nextInt();
		
		System.out.println("Number is a :"+a + "\nNumber is b :"+b+ "\nNumber is l :"+l);
		
		A1=a*a;
		System.out.println("Square is Area = "+A1);
		
		P1=4*a;
		System.out.println("Square is Preimeter = "+P1);
		
		A2=l*b;
		System.out.println("Rectangle is Area = "+A2);
		
		P2=2*(l+b);
		System.out.println("Rectangle is Preimeter = "+P2);
	}

}
