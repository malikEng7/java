package theFirst;

public class Main2D035 {

	public static void main(String[] args) {
		
		// like matrex 
		String[][] Array_2D = {{"apple", "orang", "banan"}, 
							   {"potato", "onion", "carrot"}, 
							   {"chickin", "beef", "fish", "bat"}};
		

		char[][] telephone={{'1','2','3'},
							{'4','5','6'},
							{'7','8','9'},
							{'*','0','#'}};
		
		for(String[] foods: Array_2D) {
			for(String food: foods) {
				System.out.print(food + " ");
			}
			System.out.println();

		}
		
		
		
		
		
		
	}
}
