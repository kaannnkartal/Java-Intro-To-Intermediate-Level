package abstractClasses;

public abstract class GameCalculator {

	
	// ABSTRACT SINIF NEWLENEMEZ. İCİNE YAZILMIS OLAN ABSTRACT METOT İSE MİRASCILAR TARAFINDAN EZİLMEK ZORUNDADIR.!
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
