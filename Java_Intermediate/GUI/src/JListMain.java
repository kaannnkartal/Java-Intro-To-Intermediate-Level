import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListMain {

	public static void main(String[] args) {

		JFrame frame = new JFrame("ListMain Örneği");
		
		DefaultListModel<String> l = new DefaultListModel<>();
		
		l.addElement("C++");
		l.addElement("JavaScripty");
		l.addElement("Java");
		l.addElement("PHP");
		
		
		DefaultListModel<String> l2 = new DefaultListModel<>();
		
		l2.addElement("Swing");
		l2.addElement("Laravel");
		l2.addElement("VueJs");
		l2.addElement("Bootstrap");
		
		
		
		JList<String>list = new JList<>(l);
		list.setBounds(100, 100, 75, 75);
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		
		JList<String>list2 = new JList<>(l2);
		list2.setBounds(100, 200, 75, 75);
		
		JButton btn = new JButton("Göster");
		
		btn.setBounds(200, 150, 80, 30);
		
		
		btn.addActionListener(new ActionListener() {
			String txt = "";
			@Override
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex() != -1) {
					txt = "Secilen Programlama Dili : " + list.getSelectedValue();
				}
				
				if(list2.getSelectedIndex() != -1) {
					txt += "Secilen Frame Work : ";
					for(Object item : list2.getSelectedValuesList()) {
						txt+= item + " ";
					}
				}
				
				System.out.println(txt);
				
			}
			
		});
		
		
		
		frame.add(list);
		frame.add(list2);
		frame.add(btn);
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
