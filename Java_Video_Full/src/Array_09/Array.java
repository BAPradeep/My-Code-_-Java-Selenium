package Array_09;

import org.junit.Test;
public class Array {
  @Test
  public void OneArray() {
	  String [] cars = new String[3];
	  cars[0] = "Camaro";
	  cars[1] = "Convette";
	  cars[2] = "Tesla";
	  for(int i=0; i<= cars.length; i++) {
		  System.out.println(cars[i]);
		}
  }
  @Test
  public void TwoArray() {
	  String [] cars = {"Camaro","Convette","Tesla","BWM"};
	  System.out.println(cars[2]);
  }
//  @Test
//  public void ThreeArray() {
//	  String [] cars = {"Camaro","Convette","Tesla","BWM"};
//	  for(int a=0; a<=cars.length; a++) {
//		  System.out.println(a);
//	  }
//  }
}
