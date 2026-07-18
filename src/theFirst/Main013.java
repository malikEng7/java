package theFirst;

public class Main013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Malik Is";
		
		int length = name.length();
		char letter = name.charAt(6);
		
		
		int index = name.indexOf("i");
		int lastIndex = name.lastIndexOf("i"); 
		
		//name = name.toUpperCase();
		//name = name.toLowerCase();
		name = name.replace("Is", "ARE");

		if(name.equals("Password")) {
			System.out.print("your name can't be password");
		}
		else {
			System.out.println("Hello " + name);
		}
		
		System.out.println(letter);
		

	}

}
