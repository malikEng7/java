package theFirst;

public class Array033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 5, 7, 2, 3, 4, 9};
		String[] fruts = {"A", "B", "C", "D"};
		String target = "C"; // you can ching this if->  int | String 
		boolean isFound = false;
		 
		
		for(int i=0; i < fruts.length; i++) {
			if(fruts[i].equals(target)) {
				System.out.print(" the number in index: "+ i);
				isFound = true;
				break; 
				
			}
		}
		if(!isFound) {
			System.out.print(" nothing ");
		}
		
	
		
	}

}
