package theFirst;

public class Array031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits = {"apple", "orangg", "banana", "cocunt"}; 
		
		int num = fruits.length; // 4
		fruits[0] = "pineapple";
		fruits[3] = "Nothin";
		
		
		//System.out.println(fruits[0] + " " + fruits[3]);
		for(int i = 0; i < fruits.length;i++) {
			System.out.print(fruits[i] + " ");
			
		}
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}
