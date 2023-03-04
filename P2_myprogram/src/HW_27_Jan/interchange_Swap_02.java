// 2.Write a program to interchange the content of two variables C and D. (C=10 and D=20 ----->  C=20 AND D=10)

package HW_27_Jan;

public class interchange_Swap_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C = 10,D =20,temp;
		System.out.println("Before swapping values of C = " + C + " AND D = " + D); 
		
		temp = C;
		C=D;
		D =temp;
		
		System.out.println("After swapping values of C = " + C + " AND D =" + D); 

	}

}
