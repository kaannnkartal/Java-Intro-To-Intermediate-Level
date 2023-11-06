package oopIntro;

public class Product {

	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discountRate;

	
	
	Product(){
		this.discountRate = 10;
	}
	
	Product(int id, String name, double unitPrice, String detail, double discountRate, double unitPriceAfterDiscount){
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discountRate = discountRate;
		
	}
	
	// this() parametresiz contructor'ı calıstırır.
	// SOLID KOD PRENSİPLERİNDEN S :
	// Single Responsibility : Her class her metod sadece bir isi yapmakla yükümlüdür.
	// Suan bizim product classımız ozellik tutmaktadır.
	// Onunla ilgili is yapan metodları kodları is sınıfı olusturup onun icine koyarız.
	// Classlar 2ye ayrılır. 1.si Ozellik tutan classlar, 2. Metot tutan classlar.
	// Yani suan bu class ozellik tuttuğu icin, icine metot yazılmaz.!

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getUnitPriceAfterDiscount() {
		return (this.unitPrice - (this.unitPrice * (this.discountRate / 100)));
	}

	
	

	
	
	
	
	
}
