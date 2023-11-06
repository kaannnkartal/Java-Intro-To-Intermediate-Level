package inheritance;

public class Main {

	public static void main(String[] args) {
		
		// Keyword : Sürdürülebilir yazılım icin INHERITANCE!
		
		IndividualCustomer engin = new IndividualCustomer();
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		
		engin.setCustomerNumber("12345");
		hepsiBurada.setCustomerNumber("6789");
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(hepsiBurada); // Bu sirket müsterisi
		customerManager.add(engin); // Bu bireysel müsteri
		// ikisi de farklı classlardan olduğu halde customerManeger.add() metodunu kullanabildi.
		// Cünkü CustomerManager sınıfının add fonksiyonu Customer Tipinde bir parameter aldı.
		// Hem sirket müsterisi hem de bireysel müsteri birer customer olduğu icin (extends customer)
		// bu metot iki farklı tip icin de calısmıs oldu.
		// BUNA POLYMORPHISIM DENİYOR.
		
	}

}
