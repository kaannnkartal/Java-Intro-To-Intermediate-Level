
public class Memurlar extends Calisan{
	
	String departman;
	int mesai;
	public Memurlar(String ad, String soyad, String email, String telefon, String departman, int mesai) {
		super(ad, soyad, email, telefon);
		this.departman = departman;
		this.mesai = mesai;
	}
	
	
	public void giris() {
		System.out.println(this.ad +" " + this.soyad +" Giris yapti B kapisindan!");
	}
	
	

	

}
