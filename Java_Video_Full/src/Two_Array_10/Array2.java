package Two_Array_10;

public class Array2 {
	public static void main(String ary[]) {
		String [][] cars = new String[5][3];
		cars[0][0] = "Tata ev";
		cars[0][1] = "Harrier";
		cars[0][2] = "Safari";
		cars[1][0] = "Mahindra 700";
		cars[1][1] = "500";
		cars[1][2] = "300";
		cars[2][0] = "Kia seltos";
		cars[2][1] = "EV GTLINE";
		cars[2][2] = "Carens";
		cars[3][0] = "Lamborghini Huracan";
		cars[3][1] = "Aventador";
		cars[3][2] = "Urus";
		cars[4][0] = "Bmw x77";
		cars[4][1] = "i8";
		cars[4][2] = "z4";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+"   ");
			}
		}
	}

}
