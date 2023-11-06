package interfaces;

public class CustomerManager {

	private Logger logger;  // Injection.
	private Logger loggers[];
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}
	
	public CustomerManager(Logger loggers[]) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müsteri Eklendi : " + customer.getFirstName());
		this.logger.log(customer.getFirstName());		
	}
	
	public void addMultipleLog(Customer customer) {
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müsteri Silindi : " + customer.getFirstName());
		this.logger.log(customer.getFirstName());
	}
}
