package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		// müsteri ekleme kodları..
		System.out.println("Müsteri eklendi.");
		
		//DatebaseLogger logger = new DatebaseLogger();  --> Somut is yapan bir class newlenmez bir manager somut clasıında.
		
		logger.log();
	}
}
