
public class Calisan {
	protected String ad, soyad, telefon, email;
	
	
	
	Calisan(String ad, String soyad, String email, String telefon){
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
		this.telefon = telefon;
	}
	
	
	
	public void giris() {
		System.out.println("Calisan " + this.ad + " " + this.soyad +" giris yapti.");
	} 
	
	public void cikis() {
		System.out.println("Calisan " + this.ad + " " + this.soyad +" cikis yapti.");
	}
	
	public void yemek() {
		System.out.println("Calisan " + this.ad + " " + this.soyad +" yemek");
	}


	
	public static void listele(Calisan [] girisYapanlar) {
		
		for(Calisan c : girisYapanlar) {
			c.giris();
		}
	}
	

	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
	
	
	
}
