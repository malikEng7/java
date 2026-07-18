package programming_terms;

public class VarargsaMthod034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =add(1, 3, 5, 7, 9);
		System.out.print(i);
	}
	static int add(int... numbers) {
		int sum =0;
		System.out.println(numbers.length + "  ");

		
		for(int number: numbers) { // it will be int for every number in my arry of numbers 
			sum = sum + number ;
			
		}
		return sum;
		
	}
}
