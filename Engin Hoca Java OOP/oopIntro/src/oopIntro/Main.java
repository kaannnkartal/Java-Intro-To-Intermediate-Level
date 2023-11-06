package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo V14"); 
		product1.setUnitPrice(15000);
		product1.setDetail("16 GB RAM");
		
		Product product2 = new Product();
		product2.setId(2); 
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("32 GB RAM");
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("HP 5");
		product3.setUnitPrice(10000);
		product3.setDetail("8 GB RAM");
		
		
		Product [] products = {product1,product2,product3};
		
		System.out.println(products.length);
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar Kategorisi";
		
		Category category2 = new Category();
		category2.id = 2;
		
		System.out.println(category2.name);
		
		
		System.out.println("----");
		
		for (Product product : products) {
			
			System.out.println(product.getUnitPriceAfterDiscount());
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		
		
	}

}
