package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Birbirinin alternatifi olan kodlar icin if yazılmaz.
		
		LogManager logManager = new LogManager();
		//logManager.log(1);
		
		FileLogger fileLogger = new FileLogger();
		logManager.log(fileLogger);
	}

}
