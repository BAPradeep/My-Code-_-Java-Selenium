// 17.Program to print numbers 100, 95, 90, 85, ...... -20.

package HW_27_Jan;

public class number_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a=100; a>=-20; a--) {
			if(a%5==0) {
				System.out.println(a);
			}
		}

	}

}
