import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableMain {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("ComboBox örneği");
		

		String[][] veri = {{"1" , "Mat" , "85"}, {"2", "Fen","50"}, {"3", "Tur","100"}};
		
		String[] baslik = {"ID", "DERS","NOT"};
		
		JTable table1 = new JTable(veri,baslik);
		table1.setBounds(30, 40, 200, 300);
		
		JScrollPane sp = new JScrollPane(table1);
		
		//sp.setBounds(30,40,200,300);
		
		
		
		
		
		
		//frame.add(table1);
		frame.add(sp);
		frame.setSize(400,400);
		frame.setVisible(true);


	}

}
