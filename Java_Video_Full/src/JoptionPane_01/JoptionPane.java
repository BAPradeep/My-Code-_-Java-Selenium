import javax.swing.*;
package JoptionPane_01;

public class JoptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JoptionPane.showInputDialog("Enter your name");
		JoptionPane.showMessageDialog(null, "Hello"+name);
		
		int age = Integer.parseInt(JoptionPane.showInputDialog("Enter your age"));
		JoptionPane.showMessageDialog(null,"you are"+age+"Year old");
		
		double height = Double.parseDouble(JoptionPane.showInputDialog("Enter your height"));
		JoptionPane.showMessageDialog(null, "you are"+height+" cm tall");

	}

}
