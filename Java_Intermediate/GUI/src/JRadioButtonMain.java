import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JRadioButtonMain {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("RadioButton Örneği");
		
		
		JRadioButton rb1 = new JRadioButton("Kadın");
		rb1.setBounds(100, 50, 100, 50);
		rb1.setActionCommand("K");
		
		JRadioButton rb2 = new JRadioButton("Erkek");
		rb2.setBounds(100, 100, 100, 50);
		rb2.setActionCommand("E");
		
		JRadioButton rb3 = new JRadioButton("İstemiyorum");
		rb3.setBounds(100, 150, 100, 50);
		rb3.setActionCommand("N");
		
		ButtonGroup bGroup = new ButtonGroup();
		
		bGroup.add(rb1);
		bGroup.add(rb2);
		bGroup.add(rb3);
		
		
		
		
		JButton buton1 = new JButton("Gönder");
		buton1.setBounds(100, 200, 100, 30);
		
		buton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(bGroup.getSelection().getActionCommand());
				
			}
			
			
		});
		
		
		
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);
		frame.add(buton1);
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		

	}

}
