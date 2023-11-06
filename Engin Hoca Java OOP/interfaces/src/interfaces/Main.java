package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CustomerManager customerManager = new CustomerManager(new SmsLogger());
		
		Logger smsLog = new SmsLogger();
		Logger emailLog = new EmailLogger();
		Logger databaseLog = new DatabaseLogger();
		Logger fileLog = new FileLogger();
		
		Logger logs[] = {smsLog,emailLog,databaseLog,fileLog};
		Customer engin = new Customer(1,"Engin","Demiroğ");
		//CustomerManager customerManager = new CustomerManager(new EmailLogger());
		
		CustomerManager customerManager = new CustomerManager(logs);
		customerManager.addMultipleLog(engin);
	}

}
