import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("OptionPane Örneği");

		
		//JOptionPane.showMessageDialog(frame, "Merhaba, Kodlama Vaktine Hoşgeldin!");
		
		
		//JOptionPane.showMessageDialog(frame, "Abone Oldun", "Abone Ol" , JOptionPane.WARNING_MESSAGE);
		
		//String str = JOptionPane.showInputDialog(frame,"Adınız");
		//System.out.println(str);
		
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
