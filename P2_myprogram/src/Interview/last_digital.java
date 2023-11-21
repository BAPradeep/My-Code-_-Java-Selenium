// print last digit of the given number
package Interview;

public class last_digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9876,lastdigit=0, firstdigit = 0;
		
		lastdigit = number%10; // three last digit
		System.out.println("Last digit: "+lastdigit);
		
		while(number!=0) {
			firstdigit = number%10; // 6
			number /= 10; //9
		}
		System.out.println("First digit: "+firstdigit);
		

	}

}
