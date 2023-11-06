import java.util.*;
public class LinkedHashMapMain {

	public static void main(String[] args) {
		
		LinkedHashMap ogr = new LinkedHashMap();
		
		
		ogr.put("Ali", 90);
		ogr.put("Veli", 80);
		ogr.put("Ahmet", 75);
		
		Set set = ogr.entrySet();
		
		Iterator i = set.iterator();
		
		
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() +" => " + item.getValue());
			
		}
		

	}

}
