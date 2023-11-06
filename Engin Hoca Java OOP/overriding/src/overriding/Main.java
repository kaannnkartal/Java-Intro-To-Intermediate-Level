package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new OgretmenKrediManager(),new TarimKrediManager(), new OgrenciKrediManager()};
		
		
		
		for(BaseKrediManager krediManager : baseKrediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}
