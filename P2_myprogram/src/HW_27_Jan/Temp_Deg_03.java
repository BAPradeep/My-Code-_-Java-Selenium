//3.Write a program to convert Fahrenheit temperature to Centigrade degrees. (C = (F-32)*(5/9)

package HW_27_Jan;
import java.util.Scanner;

public class Temp_Deg_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner FT = new Scanner(System.in);
		double C,F;
		System.out.println("Enter Fahrenheit Temperature is ");
		F= FT.nextInt();
		System.out.println("Fabrenheit Temperature : "+F);
		C=(F-32)*5/9;
		System.out.println("value of temperature in celsius:" + C);

	}

}
