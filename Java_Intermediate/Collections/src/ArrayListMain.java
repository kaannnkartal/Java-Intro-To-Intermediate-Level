import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayList country = new ArrayList();
		
		country.add("Ankara");
		country.add("Siirt");
		country.add("Bolu");
		country.add("Ankara");
		
		country.indexOf("Ankara");
		
		
		country.add(0, "Istanbul");
		
		country.remove(1);
		
		Iterator itr = country.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//
		country.forEach(i -> System.out.println(i));
		
		

	}

}
