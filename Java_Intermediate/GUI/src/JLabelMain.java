import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelMain {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Label Örneği");
		
		JLabel l1 = new JLabel(); // Yazı Kısmı
		l1.setText("Yazı Kısmı");		
		l1.setBounds(100, 50, 100, 30);
		
		JButton btn = new JButton("Buton");
		btn.setBounds(100, 100, 100, 30);
		
		
		btn.addActionListener(new ActionListener() {

			int counter = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Butona " + counter++  +" defa tıklandı");
				
			}
			
		});
		
		
		

		frame.add(l1);
		frame.add(btn);
		// FRAME İLE ALAKALI ŞEYLER EN AŞAĞIYA YAZILIR Kİ HATA VERMESİN.
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}

}
