import java.util.Vector;

public class VectorListMain {

	public static void main(String[] args) {
		
		
		// 1 vektör varsayılan olarak boyutu 10 olur. Eleman sayısı aşılırsa +10 reboyutlanır.
		
		Vector v = new Vector();
		
		// Eğer istersem default boyut sayısını değiştirip (x) yapıp. Eleman sayısı aşılırsa +x şeklinde reboyutlanır.
		// Vector v ) new Vector(5);
		v.add("Armut");
		v.add("Cilek");
		v.add("Kavun");
		v.add("Karpuz");
		v.add("Elma");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		v.add("Armut");
		
		System.out.println(v.size());
		System.out.println(v.capacity());

	}

}
