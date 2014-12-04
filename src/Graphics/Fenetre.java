package Graphics;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class Fenetre extends JFrame {
	private static final long serialVersionUID = 1L;

	double width;
	double height;
	public SpringLayout layout;

	public Fenetre() {
		super("Collectionneur");
		width = 1024;
		height = 600;
		this.setSize(new Dimension((int) width, (int) height));
		this.setFocusable(true);

		PanelPerson person = new PanelPerson(this);
		this.add(person);

		// PanelItem item = new PanelItem(this);
		// this.add(item);

		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		// Que faire quand on ferme
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setIconImage(Toolkit.getDefaultToolkit().getImage(
		// Fenetre.resourceDirectory + "Images/Pions/rouge.png"));
	}
}
