import java.util.*;

public class QueueLinkedListMain {

	public static void main(String[] args) {
		// - element() Kuyruğun basındaki öğeyi verir. Kuyruktan atmaz. Boş ise null vermez. Exception atar.
		// - offer(E o) Mümküse, verilen öğeyi kuyruğa ekler.
		// - peek() kuyruğun başındaki öğeyi verir. Onu kuyruktan atmaz. Kuyruğun başı boşsa null verir.
		// - pool() kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. Kuyruk boşsa null verir.
		// - remove() kuyruğun başındaki öğeyi verir ve onu kuyruktan atar.
		
		
		Queue q = new LinkedList();  // Nesnesi olusturulurken Queue initialize edilmiyor? Sacma? LinkedListten bir q açtık.
		// Polymorphism.
		
		//FIFO MANTIĞI VARDIR. FIFO
		q.add("Deniz");
		q.add("Mehmet");
		
		q.forEach(item -> System.out.println(item));
		
		System.out.println("******************");
		
		
		PriorityQueue pq = new PriorityQueue();
		
		
		
		pq.add(80);
		pq.add(10);
		pq.add(20);
		pq.add(50);
		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
		

	}

}
