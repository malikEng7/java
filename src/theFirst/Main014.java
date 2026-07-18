package theFirst;

public class Main014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Email = "malik123@gamil.com";
		
		int length = Email.length();
		
		String username = Email.substring(0, Email.indexOf("@"));
		String Domain = Email.substring(Email.indexOf("@") + 1);
		System.out.println(Domain);
		
		
	}

}
