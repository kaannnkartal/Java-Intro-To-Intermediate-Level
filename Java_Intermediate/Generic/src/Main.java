import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		
		
		for(Integer item : a) {
			System.out.println(item);
		}
		
		
		HashMap<Integer,String> c = new HashMap<>();
		
		
		c.put(1, "Adana");
		c.put(7, "Antalya");
		c.put(34, "İstanbul");
		
		
		for(Integer key : c.keySet()) {
			System.out.println("Key : " + key  + " -Value : " + c.get(key));
		}
		
		for(String value : c.values()) {
			System.out.println(value);
		} */
		
		
		
		/*Test<Integer> i = new Test<Integer>(15);
		
		System.out.println(i.getObj());
		
		Test<String> s = new Test<String>("Kodlama vakti");
		
		System.out.println(s.getObj()); */
		
		
		
		Integer[] intArr = {1,2,3,4};
		
		Double[] doubleArr = {1.1,2.1,3.1,4.1};
		
		Character[] charArr = {'K','O','D'};
		
		genericMethod(intArr);
		
		genericMethod(doubleArr);

	}
	
	
	public static <E> void genericMethod(E[] arr) {
		
		for(E element : arr) {
			System.out.println(element);
		}
	}

}
