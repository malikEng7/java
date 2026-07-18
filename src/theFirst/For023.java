package theFirst;

public class For023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// break 
		// continuse 
		
		for(int i=0; i < 10; i++){
			if(i==4) {
				break;
			}
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
