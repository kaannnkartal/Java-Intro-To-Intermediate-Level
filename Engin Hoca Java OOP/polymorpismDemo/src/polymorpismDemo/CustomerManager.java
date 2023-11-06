package polymorpismDemo;

public class CustomerManager {

	public void logCustomer(BaseLogger logger) {
		logger.log();
	}
	
	public void multipleLogCustomer(BaseLogger[] loggers) {
		for(BaseLogger logger : loggers) {
			logger.log();
		}
	}
}
