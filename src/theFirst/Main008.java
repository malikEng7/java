package theFirst;
import java.util.Random;

public class Main008 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int num;
		boolean con;
		
		
		
		num = random.nextInt(1, 7);
		System.out.print(num );
		
		con = random.nextBoolean(); 		
		System.out.print(con);
		
		
	}

}
