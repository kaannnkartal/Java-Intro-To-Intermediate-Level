
public class OgretimUyesi extends Akademisyen {

	String unvan;

	public OgretimUyesi(String ad, String soyad, String email, String telefon, String bolum, String gorevler,
			String[] dersler, String unvan) {
		super(ad, soyad, email, telefon, bolum, gorevler, dersler);
		this.unvan = unvan;
	}
	
	
	public void giris() {
		
		System.out.print(this.unvan + " ");
		super.giris();
	}


	@Override
	public void derseGir(int dersSaati) {
		
		System.out.println(getUnvan() +" "+ getAd() +" " + getSoyad() +" " + getDersler()[0] + " saat: "+ dersSaati +" Ogretim üyesi olarak girdi");
		
	}


	public String getUnvan() {
		return unvan;
	}


	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	
	
	
	
}
