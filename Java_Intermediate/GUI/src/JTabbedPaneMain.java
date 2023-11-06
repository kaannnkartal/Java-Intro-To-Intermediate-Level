import javax.swing.*;

public class JTabbedPaneMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tab Pane Örneği");

		JLabel lbl = new JLabel("İlk Alan");	
		JPanel p1 = new JPanel();
		p1.add(lbl);
		
		
		JLabel lb2 = new JLabel("İkinci Alan");	
		JPanel p2 = new JPanel();
		p2.add(lb2);
		
		
		JLabel lb3 = new JLabel("Üçüncü Alan");	
		JPanel p3 = new JPanel();
		p3.add(lb3);
		
		
		JTabbedPane tp = new JTabbedPane();
		
		tp.setBounds(50, 50, 200, 200);
		tp.add("ilk", p1);
		tp.add("İkinci", p2);
		tp.add("Üçüncü", p3);
		
		frame.add(tp);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
