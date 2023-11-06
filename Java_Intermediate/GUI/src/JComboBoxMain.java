import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JComboBoxMain {

	public static void main(String[] args) {
	
		
		JFrame frame = new JFrame("ComboBox örneği");
		
		
		String arr [] = {"C" , "C#" , "C++" , "Java","Python"};
		
		JComboBox cb = new JComboBox(arr);	
		cb.setBounds(50,100,90, 20);
		
		JButton btn  = new JButton("Seç");
		btn.setBounds(50, 150, 80, 20);
		
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "Seçilen programlama dili  : " + cb.getItemAt(cb.getSelectedIndex());
				System.out.println(text);
				
			}
			
		});
		
		
		frame.add(btn);
		frame.add(cb);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
