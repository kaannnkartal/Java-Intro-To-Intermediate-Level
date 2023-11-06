import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonMain {

	public static void main(String[] args) {
		
		//JButton
		//btn.setBounds(x,y,widht,height); buradaki x,y butonun sol üst köşesinin hangi koordinatta olması gerektiğidir.
		//genişlik ve yükseklik butonun kısa ve uzun kenarlarını veririz.
		
		
		JFrame frame = new JFrame("Buton Örneği");
		
		JButton btn = new JButton("Gönder");
		
		btn.setBounds(0, 0, 100, 30);
		
		btn.addActionListener(new ActionListener() {

			@Override
			// Burası butona tıklandığı an. O place burası.
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Butona Tıklandı!");
			}
			
		});
		
		
		
		
		frame.add(btn);
		
		// FRAME İLE ALAKALI ŞEYLER EN AŞAĞIYA YAZILIR Kİ HATA VERMESİN.
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		

	}

}
