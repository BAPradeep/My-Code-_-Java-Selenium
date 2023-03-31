package TypeData_11;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String = a reference data type that can stores one and more
		// character  reference data type have access to used methods
		
		String name = "This is Pradeep with CODE";
		
	//	boolean result = name.equals("This is Pradeep with CODE"); // true or false
	//	int result = name.length(); // how many word
	//	char result = name.charAt(5); //how find to index with sentence
	//	int result = name.indexOf("O"); // how find to number with sentence
	//	boolean result = name.isEmpty(); // variable is need value is empty then True
	//	String result = name.toLowerCase(); // all sentence will be lower captial
	//	String result = name.toUpperCase(); // all sentence will be upper captial
	//	String result = name.trim();
		String result = name.replace("Pradeep", "BAPradeep"); // change name in old to new
		
		System.out.println(result);

	}

}
