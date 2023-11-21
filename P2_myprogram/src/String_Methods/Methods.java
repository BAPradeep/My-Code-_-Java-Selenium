package String_Methods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Win Vinaya Foundation", b= "Arekere", c = "Bengaluru";
		System.out.println("Concatenate : "+b.concat(c));
		System.out.println("2 String Equal : "+b.equals(c));
		System.out.println("Length that how many each word : "+a.length());
		System.out.println("Substring is take one part of word : "+a.substring(4,10));
		System.out.println("The character is find index : "+a.charAt(4));
		System.out.println("The index is find character : "+c.indexOf("l"));
		System.out.println("The character into uppercase/lowercase : "+b.toUpperCase());

	}

}
