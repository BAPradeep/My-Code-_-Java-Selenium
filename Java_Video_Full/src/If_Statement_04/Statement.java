package If_Statement_04;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if statement  = performs a block of code  if it's condition evaluates to be true
		int age = 163;
		
		if(age >= 40 & age <= 105){
			System.out.println("Ok Boomer");
		}
		else if(age >= 18 & age <= 40) {
			System.out.println("you are an adult!");
		}
		else if(age >= 13 & age <= 18) {
			System.out.println("you are no an adult");
		}
		else {
			System.out.println("So sorry and some next year then you will apply");
		}
		

	}

}
