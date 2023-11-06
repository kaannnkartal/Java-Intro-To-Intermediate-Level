
public class Main {

	public static void main(String[] args) {
		
		
		/*for(int i = 0; i<50; i++) {
			System.out.print(i +" ,");
		}
		
		System.out.println();
		for(int j = 0; j<30; j++) {
			System.out.print(j +" ,");
		} */
		

		
		
		Islemler i1 = new Islemler("ilk");
		Thread t1 = new Thread(i1);
		
	
		Islemler i2 = new Islemler("iki");
		Thread t2 = new Thread(i2);
		
		t1.start();
		t2.start();

	}

}
