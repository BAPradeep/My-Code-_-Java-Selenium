package Nested_Loop_08;

import java.util.Scanner;

public class Nest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// nested loops = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		// row line/Horizontal line
		System.out.println("Enter $ of Rows: ");
		rows = scanner.nextInt();
		//columns vertical line
		System.out.println("Enter $ of Columns: ");
		columns = scanner.nextInt();
		//Symobl like £!$%@
		System.out.println("Enter symbol to use");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol); // without println
			}
		}

	}

}
