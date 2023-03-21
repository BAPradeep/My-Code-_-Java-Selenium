package Interview;

public class last_digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234567895, firstdigit = 0,lastdigit=0;
		
		lastdigit = number%10;
		System.out.println("Last digit: "+lastdigit);
		
		while(number!=0) {
			firstdigit = number%10;
			number /= 10;
		}
		System.out.println("First digit: "+firstdigit);
		

	}

}
