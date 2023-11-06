import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		// - clear() Map icinde bulunan bütün değerleri siler
		// - get (Object key) Anahtara karşılık gelen objeyi döndürür.
		// - put (Object key , Object value) Anahtar - değer ikilisini kayıt eder.
		
		// Aynı adresten indisten iki tane olamaz. Keyler unique'dir.
		
		
		HashMap b = new HashMap();
		
		b.put("turkiye", "ankara");
		b.put("fransa", "paris");
		b.put("ingiltere", "londra");
		
		
		Set s = b.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			
			Map.Entry item = (Map.Entry) i.next();
			
			System.out.println(item.getKey() + " => " + item.getValue());
		}
		
		

	}

}
