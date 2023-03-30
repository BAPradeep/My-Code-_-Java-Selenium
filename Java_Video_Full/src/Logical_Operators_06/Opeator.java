package Logical_Operators_06;

import java.util.Scanner;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class Opeator {
  @Test
  public void AND() {
	// || is code on Below
			Scanner scanner = new Scanner(System.in);
			System.out.println("You are playing a game! Press q or Q to Quit");
			String response = scanner.next();
			
			if(response.equals("q") && response.equals("Q")) {
				System.out.println("You are still playing the game *PEW PEW*"); // opposite 17 and 20 lines
			}
			else {
				System.out.println("You quit the game");				
			}
  }
  
  @Test
  public void OR() {
	// || is code on Below
			Scanner scanner = new Scanner(System.in);
			System.out.println("You are playing a game! Press q or Q to Quit");
			String response = scanner.next();
			
			if(response.equals("q") || response.equals("Q")) { // normal 32 and 35 lines
				System.out.println("You quit the game");
			}
			else {
				System.out.println("You are still playing the game *PEW PEW*");
			}
  }
}
