package For_Loop_07;

import org.junit.Test;

public class For {
  @Test
  public void Asc() {
	  //ascend
	  for (int a=0; a<=10; a++) {
		  System.out.println(a);
	  }
	  System.out.println("Ascend of number");
  }
  @Test 
  public void Desc() {
	  //Descent
	  for(int b=10; b>=0; b--) {
		  System.out.println(b);
	  }
	  System.out.println("Descend of number");
  }
  @Test
  public void Even() {
	  // ascend with even
	  for(int c=0; c<=10; c+=2) {
		  System.out.println(c);
	  }
	  System.out.println("Even of number");
  }
}
