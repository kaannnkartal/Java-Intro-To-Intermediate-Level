import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxMain {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("CheckBox");
		
		JLabel label1 = new JLabel("Seçim yapın!");
		label1.setBounds(100, 50, 300, 50);
		
		JCheckBox cb1 = new JCheckBox("C++");
		cb1.setBounds(100, 100, 250, 50);
		
		JCheckBox cb2 = new JCheckBox("Java");
		cb2.setBounds(100, 150, 250, 50);
		
		/*JButton buton1 = new JButton("Kontrol");
		buton1.setBounds(100, 200, 100, 30);
		
		buton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(cb1.isSelected()) {
					System.out.println(cb1.getText() +" Secildi");
				}
				if(cb2.isSelected()) {
					System.out.println(cb2.getText() +" Secildi");
				}
				
				
			}
			
		}); */
		
		
		cb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				label1.setText("C++ Seçim Kutusu " + (e.getStateChange() == 1 ? "Seçildi" : "Seçilmedi"));
			}
			
		});
		
		cb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				label1.setText("Java Seçim Kutusu " + (e.getStateChange() == 1 ? "Seçildi" : "Seçilmedi"));
			}
			
		});
		frame.add(cb1);
		frame.add(cb2);
		//frame.add(buton1);
		frame.add(label1);
		
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

		

	}

}
