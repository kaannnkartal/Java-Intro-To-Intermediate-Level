import java.util.*;


public class SetMain {

	public static void main(String[] args) {
		// HashSet<E>
		// LinkedHashSet<E>
		// TreeSet <E>
		
		HashSet h = new HashSet(); // Add ile girilen objectler rastgele karmaşık bir fonksiyon indexlemesiyle sıralanırlar.
		
		h.add("12");
		h.add(12);
		h.add(12.0);
		h.add(true);
		h.add(null);
		
		Iterator itr = h.iterator();
		
		
		/*while(itr.hasNext()) {
			//System.out.println(itr.next());
		}*/
		
		
		//h.forEach(item -> System.out.println(item + " "));
		
		
		LinkedHashSet gunler = new LinkedHashSet(); // Add ile girilen objectlerin sırasına göre sıralanırlar.
		
		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsamba");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.add("Pazartesi");
		
		//gunler.forEach(item -> System.out.println(item + ","));
		
		
		TreeSet tree = new TreeSet();  // Kendi içerisinde add ile eklenen değerleri küçükten büyüğüe sıralar.
		
		tree.add(10);
		tree.add(1);
		tree.add(2);
		tree.add(6);
		
		// tree.add(null);  Sadece bu set türü yani treeset null değer kabul etmez.  

		
		tree.forEach(item -> System.out.println(item + ","));
		
		
		
	}

}
