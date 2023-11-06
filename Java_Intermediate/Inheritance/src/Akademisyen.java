
public abstract class Akademisyen extends Calisan {

	String bolum, gorevler;
	String [] dersler;
	
	
	
	
	/*Akademisyen(String ad, String soyad, String email, String telefon) {
		super(ad, soyad, email, telefon);
	}*/
	
	
	public Akademisyen(String ad, String soyad, String email, String telefon, String bolum, String gorevler,String[] dersler) {
		super(ad, soyad, email, telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.dersler = dersler;
	}




	public abstract void derseGir(int dersSaati);
	
	public void giris() {
		System.out.println(this.ad +" " + this.soyad +" Giris yapti A kapisindan!");
	}




	public String getBolum() {
		return bolum;
	}




	public void setBolum(String bolum) {
		this.bolum = bolum;
	}




	public String getGorevler() {
		return gorevler;
	}




	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}




	public String[] getDersler() {
		return dersler;
	}




	public void setDersler(String[] dersler) {
		this.dersler = dersler;
	}

	
	
	
}
