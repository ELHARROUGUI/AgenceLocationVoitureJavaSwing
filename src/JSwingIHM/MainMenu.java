package JSwingIHM;

import javax.swing.*;

public class MainMenu{

	private JMenuBar Menu;
	private JMenu MnFichier;
	private JMenuItem MnFQuitter;
	private JMenu MnModifier;
	private JMenu MnAffichage;
	private JMenu MnAide;
	
	public MainMenu()
	{
		Menu = new JMenuBar();
		MnFichier = new JMenu("Fichier");
		MnFQuitter = new JMenuItem ("Quitter");
		MnFichier.add(MnFQuitter);
		MnModifier = new JMenu("Modifier");
		MnAffichage  = new JMenu("Affichage");
		MnAide = new JMenu("Aide");
		Menu.add(MnFichier);
		Menu.add(MnModifier);
		Menu.add(MnAffichage);
		Menu.add(MnAide);
	}
	
	public JMenuBar getMenuBar()
	{
		return Menu;
	}
}
