package Graphics;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class PanelPerson extends JPanel {
	private static final long serialVersionUID = 1L;
	Fenetre f;
	JLabel ok;

	public PanelPerson(Fenetre f) {
		super();
		this.f = f;
		this.setBackground(f.getBackground());
		this.setPreferredSize(new Dimension((int) f.width, (int) f.height));

		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);

		ok = new JLabel("OK person");
		this.add(ok);

		layout.putConstraint(SpringLayout.VERTICAL_CENTER, ok, 0,
				SpringLayout.VERTICAL_CENTER, f);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, ok, 0,
				SpringLayout.HORIZONTAL_CENTER, f);
	}
}
