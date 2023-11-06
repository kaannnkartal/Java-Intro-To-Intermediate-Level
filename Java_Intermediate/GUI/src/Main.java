import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// Graphical User Interface (GUI)
		// Swing : Sun Microsystems tarafından piyasaya sürülen resmi Java GUI aracıdır
		
		
		
		JFrame frame = new JFrame();    // Arayüz programının çerçeveli ekranını oluşturduk.
		frame.setSize(200, 200);  // Daha sonra bu ekranın boyutlarını 200e200 olacak şekilde ayarladık
		
		
		JPanel panel = new JPanel();
		
		
		JButton btn = new JButton("Buton"); // Bir buton oluşturduk rastgele bir örnek. İlerleyen zamanda detaylı görücez.
		// frame.getContentPane dediğim zaman framedeki tüm alanı kapsayacak bir buton oluştu.
		//frame.getContentPane().add(btn); // frame.getContentPane dediğimiz zaman çerçevenin içindeki frame bölgesine eriştik.
		
		
		//frame.getContentPane ekleme sorunundan dolayı, önce bir panel oluşturup daha bu panele bir buton eklediğimde olması gerektiği gibi küçük bir buton oluştu. Tüm alanı kaplamadı.
		panel.add(btn);
		
		
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit kısmı tam anlaşılmadı?
		frame.setVisible(true); // Default olarak false geliyor DİKKAT. Bizim frame'i görebilmemiz icin setVisible true olmalı.

	}

}
