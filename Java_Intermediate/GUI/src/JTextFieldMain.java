import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldMain {

	public static void main(String[] args) {
		
		//JTextField metin alanları demektir.
		
		JFrame frame = new JFrame("TextField Örneği");
		JLabel l1,l2;
		JTextField t1,t2,t3;
		JButton b1;
		
		l1 = new JLabel("İlk Sayı");
		l2 = new JLabel("İkinci Sayı");
		
		
		t1 = new JTextField("");
		t2 = new JTextField("");
		t3 = new JTextField("");
		
		b1 = new JButton("Topla");
		
		
		
		
		l1.setBounds(0, 50, 80, 20);
		l2.setBounds(100, 50, 80, 20);
		
		t1.setBounds(0, 100, 40, 20);
		t2.setBounds(100, 100, 40, 20);
		t3.setBounds(200, 100, 40,20);
		t3.setEditable(false);
		
		b1.setBounds(300, 100,80, 20);
		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				
				int sonuc = n1 + n2;
				
				t3.setText(String.valueOf(sonuc));
			}
			
		});
		
		
		
		
		frame.add(l1);
		frame.add(l2);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		
		frame.add(b1);
		// FRAME İLE ALAKALI ŞEYLER EN AŞAĞIYA YAZILIR Kİ HATA VERMESİN.
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
