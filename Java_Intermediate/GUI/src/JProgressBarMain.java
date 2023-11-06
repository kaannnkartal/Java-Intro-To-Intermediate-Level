import javax.swing.*;

public class JProgressBarMain {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame("OptionPane Örneği");

		JProgressBar jb = new JProgressBar(0,2000); // start end finish
		
		jb.setBounds(40, 40, 160, 30);
		jb.setValue(0);
		
		jb.setStringPainted(true);
		
		
		
		
		
		frame.add(jb);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		int i = 0;
		
		while(i<=2000) {
			jb.setValue(i);
			i = i + 20;
			Thread.sleep(150);
		}
		

	}

}
