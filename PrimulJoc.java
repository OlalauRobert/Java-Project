package principal;

import java.io.IOException;

import javax.swing.JFrame;

public class PrimulJoc {
	
	public static void main(String[] args) {
		JFrame fereastra = new JFrame();
		fereastra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fereastra.setResizable(false);
		fereastra.setTitle("Olalau.Robert -> First Game");
		
		Panou panoulJocului = new Panou();	
		fereastra.add(panoulJocului);
		fereastra.pack();		
		fereastra.setLocationRelativeTo(null);
		fereastra.setVisible(true);
		
		panoulJocului.pornesteFirulJocului();
		
		
	}

}