import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JMenuMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("OptionPane Örneği");


		JMenuBar mb = new JMenuBar();		// Menü bar çizgisi
		JMenu menu = new JMenu("Ana Menü");  // Ana Tıklanacak Menü sekmesi
		JMenu subMenu = new JMenu("Sub Menü");
		
		JMenuItem i1 = new JMenuItem("Menu 1"); // Menüye tıklanınca çıkacak item listesi
		JMenuItem i2 = new JMenuItem("Menu 2");
		JMenuItem i3 = new JMenuItem("Menu 3");
		JMenuItem i4 = new JMenuItem("Menu 4");
		
		menu.add(subMenu);
		
		
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		subMenu.add(i4); 
		
		mb.add(menu);  // menü barın içine olusan menüyü ekle.
		
		i1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Menü 1 tıklandı");
				
			}
			
		});
		
		
		frame.setJMenuBar(mb); // frame'e menü bar ekle.
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
