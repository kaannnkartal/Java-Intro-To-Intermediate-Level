import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class JPopupMenuMain {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Popup Menü Örneği");

		JPopupMenu pm = new JPopupMenu("Menü");
		
		
		JMenuItem cut = new JMenuItem("Kes");
		JMenuItem copy = new JMenuItem("Kopyala");
		JMenuItem paste = new JMenuItem("Yapıştır");
		
		
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		
		
		frame.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				pm.show(frame,e.getX(),e.getY());
			}
		});
		
		//cut.addActionListener(new //);
		
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
