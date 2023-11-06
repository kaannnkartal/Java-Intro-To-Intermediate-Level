import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JPasswordFieldMain {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Password Field Örneği");
		
		JLabel label1 = new JLabel("Şifre");
		label1.setBounds(20, 20, 100, 30);
		
		JButton buton1 = new JButton("Tıkla");
		buton1.setBounds(20, 80, 100, 30);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(20, 50, 100, 30);
		
		
		buton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String password = new String(pass.getPassword());
				label1.setText(label1.getText() + password);
				
			}
			
		});
		
		
		frame.add(buton1);
		frame.add(label1);
		frame.add(pass);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		

	}

}
