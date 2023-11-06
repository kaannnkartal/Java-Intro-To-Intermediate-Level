package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		 
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();
		
		MusteriManager musteriManager = new MusteriManager();
		musteriManager.krediHesapla(new OgretmenKrediManager());

	}

}
