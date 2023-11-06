import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Program basladi");
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0 , b;
		int [] arr = new int[3];
		try {
			a = 2/1;
			System.out.println(a);
			arr[0] = 10;
			b = scan.nextInt();
		}
		catch(ArithmeticException e){
			System.out.println("0'a bolunme hatasi");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array boyut hatasi");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Bir hata var !");
			System.out.println(e.toString());
		}
		finally {
			System.out.println("BU BLOK KESİN OLARAK CALİSİR. DİKKAT! ");
		}
		
		
		
		
		
		/*try {
			arr[4] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}*/
		
		
		System.out.println("Program bitti");

	}

}
