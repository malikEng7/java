package theFirst;

public class Main020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double temp = -20 ;
		boolean isSunny = false;
		
		
		if(temp <=30 && temp >= 0 && isSunny ) {
			System.out.println("the weather is good");		
			System.out.println("the weather is sunny");	
		}
		 else if(temp <= 30 && temp >= 0 && !isSunny) {
			 System.out.println("the weather is good");	
			 System.out.println("the weather is cloudy");	 
		}
		 else if(temp > 30 || temp < 0  ) {
			 System.out.println("the weather is vere bad");	
		 }
	}

}
