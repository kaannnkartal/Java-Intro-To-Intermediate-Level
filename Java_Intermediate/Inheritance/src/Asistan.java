
public class Asistan extends Akademisyen {

	protected String yuksekLisans;
	
	

	public Asistan(String ad, String soyad, String email, String telefon, String bolum, String gorevler,
			String[] dersler, String yuksekLisans) {
		super(ad, soyad, email, telefon, bolum, gorevler, dersler);
		this.yuksekLisans = yuksekLisans;
	}



	@Override
	public void derseGir(int dersSaati) {
		System.out.println(getAd() +" "+ getSoyad() + " " + getDersler() + " saat: "+ dersSaati+ " Dersine asistan olarak girdi") ;
		
	}



	
	
	
	
}
