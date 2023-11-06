package polymorpismDemo;

public class Main {

	public static void main(String[] args) {
		
		//EmailLogger emailLogger = new EmailLogger();
		//emailLogger.log();

		BaseLogger loggers [] = {new DatabaseLogger(),new FileLogger(),new EmailLogger()};
		CustomerManager customerManager = new CustomerManager();
		customerManager.logCustomer(new DatabaseLogger());
		
		customerManager.multipleLogCustomer(loggers);
		
	}

}
