
public class Book {
	
	private String name,author,publisher;
	private int numberOfPage;
	
	
	Book(String name, int numberOfPage, String author, String publisher){
		
		this.name = name;
		//this.numberOfPage = numberOfPage;
		this.author = author;
		this.publisher = publisher;
		
		if(numberOfPage < 1) {
			this.numberOfPage = 10;
		}
		else {
			this.numberOfPage = numberOfPage;
		}
	}


	public int getNumberOfPage() {
		return numberOfPage;
	}


	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	

	
}
