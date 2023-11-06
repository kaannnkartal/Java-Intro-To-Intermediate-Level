
public class Main {

	public static void main(String[] args) {
		
		String Dersler [] = {"Ceng 101"};
		
		Calisan c = new Calisan("Kaan", "Kartal","kaan@mail.com","555");
		
		//Akademisyen a = new Akademisyen("Kaan", "Kartal","kaan@mail.com","555","CENG","Hoca",Dersler);
		
		
		Memurlar m = new Memurlar("Mehmet", "Cengiz", null, null, null, 0);
		
		c.giris();
		
		//a.giris();
		
		m.giris();
		
		OgretimUyesi o = new OgretimUyesi("Mecit Kaan", "Kartal","kaan@mail.com","555","CENG","Hoca",Dersler,"PROF");

		o.giris();
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Calisan [] girisYapanlar= {c,m,o};
		
		Calisan.listele(girisYapanlar);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		o.derseGir(10);
	}

}
