package Interview;

public class last_digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234567895, firstdigit = 0,lastdigit=0;
		
		lastdigit = number%1000;
		System.out.println("Last digit: "+lastdigit);
		
		while(number!=0) {
			firstdigit = number%100;
			number /= 100;
		}
		System.out.println("First digit: "+firstdigit);
		

	}

}
