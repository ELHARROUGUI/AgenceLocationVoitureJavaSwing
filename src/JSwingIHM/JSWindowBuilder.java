package JSwingIHM;

import java.awt.*;

import javax.swing.*;

public class JSWindowBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSWindowBuilder window = new JSWindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JSWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private ImageIcon Icon;
	private MainMenu M;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon = new ImageIcon("img/car-icon.png");	
		M = new MainMenu();

		
		
		////////////////////////////////////////
		frame.setJMenuBar(M.getMenuBar());
		frame.setTitle("ILISI2 - 2016/2017 - Agence de Location de Voitures WB");
		frame.setSize(new Dimension(1000, 700));
		frame.setIconImage(null);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		///////////////////////////////////////
	}

}
