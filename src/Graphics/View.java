package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * @author Clement
 * 
 */
public class View extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	protected GUIDisplay motherFrame;

	public View(GUIDisplay motherFrame) {
		this.motherFrame = motherFrame;
	}

	public void init() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
