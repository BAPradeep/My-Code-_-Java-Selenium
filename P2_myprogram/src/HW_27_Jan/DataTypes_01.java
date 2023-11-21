// 1.Write a program to declare all data types variables, assign values, and print it.

package HW_27_Jan;

public class DataTypes_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating and initializing custom character
		char a = 'G';
		
        // Integer data type is generally
        int i = 89;
 
        // use byte and short
        byte b = 4;
 
        // this will give error as number is
        // larger than byte range
        short s = 56;
 
        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;
 
        // is double in java
        double d = 4.355453532;
 
        // for float use 'f' as suffix as standard
        float f = 4.7333434f;
       
        //need to hold big range of numbers then we need this data type
        long l = 12121;
            
          System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
          System.out.println("long: " + l);

	}

}
