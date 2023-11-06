import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class JScrollBarMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ScrollBar Örneği");

		// 1. parametre başlangıç konumu,
		JScrollBar s = new JScrollBar(JScrollBar.VERTICAL, 0,0,0,100);
		JLabel label = new JLabel();
		label.setBounds(100, 50, 300, 30);
		
		s.setBounds(100, 100, 50, 100);
		
		s.addAdjustmentListener(new AdjustmentListener() {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				label.setText("Scroll Bar Değeri : " + (s.getValue()));
				
			}
			
		});
		

		
		frame.add(s);
		frame.add(label);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
