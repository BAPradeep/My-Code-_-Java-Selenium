package Two_Array_10;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] cars = {
				{"tata ev","harrier","safari"},
				{"mahindra 700","400","300"},
				{"bwm x7","z4","X11"}
		};
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+"   ");
			}

	}

}
}
