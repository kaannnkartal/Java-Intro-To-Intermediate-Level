package inheritance2;

public class LogManager {

	// Birbirinin alternatifi olan kodlar icin if yazılmaz.
	// Asagidaki ornek cok yanlıs bir kullanımdır. Spagetti koddur.
	
	/*public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabanına loglandı.");
		}
		else if(logType == 2) {
			System.out.println("Dosyaya Loglandı");
		}
		else {
			System.out.println("Email gonderildi");
		}
	} */
	
	public void log(Logger logger) {
		logger.log();
	}
	
	
	
	
	
}
