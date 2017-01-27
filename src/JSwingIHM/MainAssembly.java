package JSwingIHM;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class MainAssembly extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	
	private ImageIcon Icon;
	private MainMenu M;
	
	private JPanel Infos;
	private JPanel QuickAccess;
	private JPanel Principal;
	private JPanel WorkSpace;
	
	private JButton BSave;
	private JButton BHelp;
	private JLabel Label1;
	private JTree tree;
	
	public MainAssembly()
	{
		Icon = new ImageIcon("img/car-icon.png");
		
		
		M = new MainMenu();
		
		
		Label1 = new JLabel("Ceci est une Label d'infos !");
		Infos =new JPanel();
		Infos.setLayout(new FlowLayout());
		Infos.add(Label1);
		Infos.setBackground(Color.GRAY);
		
		QuickAccess = new JPanel();
		QuickAccess.setBackground(Color.CYAN);
		QuickAccess.setLayout(new GridLayout(0,10));
		BSave = new JButton("Sauver");
		BHelp = new JButton("Help");
		QuickAccess.add(BSave);
		QuickAccess.add(BHelp);
		
		Principal = new JPanel();
		Principal.setBackground(Color.WHITE);
		Principal.setLayout(new FlowLayout());
		
		WorkSpace = new JPanel();
		WorkSpace.setBackground(Color.LIGHT_GRAY);
		WorkSpace.setLayout(new FlowLayout());
		JLabel Label2 = new JLabel("Ceci est une Label du WorkSpace!");
		WorkSpace.add(Label2);
		
		
		//Principal.setSize(800, HEIGHT);
		
		//create the root node
        
        DefaultMutableTreeNode Cutomers = new DefaultMutableTreeNode("Clients");
        DefaultMutableTreeNode Cars = new DefaultMutableTreeNode("Voitures");
        DefaultMutableTreeNode Locations = new DefaultMutableTreeNode("Locations");
        //create the child nodes
        DefaultMutableTreeNode addCar = new DefaultMutableTreeNode("Ajouter Voiture");
        DefaultMutableTreeNode deletCar = new DefaultMutableTreeNode("Supprimer Voiture");
        DefaultMutableTreeNode searchCar = new DefaultMutableTreeNode("Chercher Voiture");
        
        DefaultMutableTreeNode addCutomer = new DefaultMutableTreeNode("Ajouter Client");
        DefaultMutableTreeNode deletCutomer = new DefaultMutableTreeNode("Supprimer Client");
        DefaultMutableTreeNode searchCutomer = new DefaultMutableTreeNode("Chercher Client");
        
        DefaultMutableTreeNode addLocation = new DefaultMutableTreeNode("Ajouter Location");
        DefaultMutableTreeNode deletLocation = new DefaultMutableTreeNode("Supprimer Location");
        DefaultMutableTreeNode searchLocation = new DefaultMutableTreeNode("Chercher Location");
 
        //add the child nodes to the root node
        Cars.add(addCar);
        Cars.add(deletCar);
        Cars.add(searchCar);
        
        Cutomers.add(addCutomer);
        Cutomers.add(deletCutomer);
        Cutomers.add(searchCutomer);
        
        Locations.add(addLocation);
        Locations.add(deletLocation);
        Locations.add(searchLocation);
        
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Menu de Navigation");
        root.add(Cars);	root.add(Cutomers);	root.add(Locations);
        //create the tree by passing in the root node
        tree = new JTree(root);
        
        Principal.add(tree);
		this.setLayout(new BorderLayout());
		this.add(Infos,BorderLayout.SOUTH);
		this.add(QuickAccess,BorderLayout.NORTH);
		this.add(WorkSpace,BorderLayout.CENTER);
		this.add(Principal,BorderLayout.WEST);
		this.setJMenuBar(M.getMenuBar());
		this.setTitle("ILISI2 - 2016/2017 - Agence de Location de Voitures");
		this.setSize(new Dimension(1000, 700));
		this.setIconImage(null);
		this.setLocationRelativeTo(null);
		this.setIconImage(Icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainAssembly();
	}
}
