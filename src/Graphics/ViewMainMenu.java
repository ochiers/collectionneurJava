package Graphics;

import gui.Cube3D.View3D;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewMainMenu extends View implements ActionListener {

	private static final long serialVersionUID = 2607L;
	
	private JLabel txt_empty;
	private JLabel txt_title;
	private JLabel txt_title2;
	private JLabel txt_title3;
	private JLabel txt_subtitleLeft;
	private JLabel txt_subtitleRight;
	
	private JButton bt_creaPicture;
	private JButton bt_creaProg;
	private JButton bt_creaDraw;
	private JButton bt_crea3D;
	private JButton bt_loadProg;
	private JButton bt_config;
	private JButton bt_exit;
	
	private final int PAN_WIDTH = 400; //this.motherFrame.getWidth() /2;
	private final int BUTTON_WIDTH = this.PAN_WIDTH*3 /4;
	private final int BUTTON_HEIGHT = 35;
	private final int CENTER_PAN = (this.PAN_WIDTH /2) - ((int)(this.BUTTON_WIDTH / 2));
	
	public ViewMainMenu(GUIDisplay motherFrame) {
		super(motherFrame);
		this.motherFrame = motherFrame;
		this.motherFrame.setSize(800, 599);
		init();
		this.updateUI();
		this.setVisible(true);
	}

	public void init() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		Box hight = new Box(BoxLayout.PAGE_AXIS);
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		
		this.setLayout(null);
		left.setLayout(null);
		right.setLayout(null);
		
		left.setBackground(Color.white);
		right.setBackground(Color.white);
		
		/* ------------------- Haut de la fen�tre ------------------- */
		
		this.txt_empty = new JLabel(" ");
		this.txt_empty.setFont(new Font("Serif",Font.BOLD, 28));
		this.txt_empty.setAlignmentX(CENTER_ALIGNMENT);
	    hight.add(txt_empty);
	    
		this.txt_title = new JLabel("Bienvenue");
		this.txt_title.setFont(new Font("Serif",Font.BOLD, 28));
		this.txt_title.setAlignmentX(CENTER_ALIGNMENT);
	    hight.add(txt_title);
	    
	    this.txt_title2 = new JLabel("Dans l'atelier de cr�ation d'animation");
		this.txt_title2.setFont(new Font("Serif",Font.BOLD, 28));
		this.txt_title2.setAlignmentX(CENTER_ALIGNMENT);
	    hight.add(txt_title2);
	    
	    this.txt_title3 = new JLabel("Pour des cubes � LED de tailles allant de 2*2*2 � 8*8*8");
		this.txt_title3.setFont(new Font("Serif",Font.BOLD, 28));
		this.txt_title3.setAlignmentX(CENTER_ALIGNMENT);
	    hight.add(txt_title3);
	    
	    
	    /* ------------------- Cot� Gauche ------------------- */
	    /* --- Avec des boutons pour les diff�rentes vues de cr�ation d'animation --- */
	    
	    this.txt_subtitleLeft = new JLabel("Cr�ation d'animation");
		this.txt_subtitleLeft.setFont(new Font("Serif",Font.BOLD, 28));
		this.txt_subtitleLeft.setBounds(this.CENTER_PAN + 23, 0, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
	    left.add(txt_subtitleLeft, BorderLayout.NORTH);
	    
		this.bt_creaProg = new JButton("Cr�er un programme (s�lection argument)");
		this.bt_creaProg.addActionListener(this);
		this.bt_creaProg.setBounds(this.CENTER_PAN, this.BUTTON_HEIGHT *2, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
		left.add(this.bt_creaProg);
		
		this.bt_creaDraw = new JButton("Cr�ation � partir d'une vue 2D");
		this.bt_creaDraw.addActionListener(this);
		this.bt_creaDraw.setBounds(this.CENTER_PAN, this.BUTTON_HEIGHT *4, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
		left.add(this.bt_creaDraw);
		
		this.bt_crea3D = new JButton("Cr�ation � partir d'une vue en 3D");
		this.bt_crea3D.addActionListener(this);
		this.bt_crea3D.setBounds(this.CENTER_PAN, this.BUTTON_HEIGHT *6, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
		left.add(this.bt_crea3D);
	    
	    
	    /* ------------------- Cot� Droit ------------------- */
		/* --- Avec des boutons de chargement, de sortie de l'application --- */
		
		this.txt_subtitleRight = new JLabel("Diff�rentes fonctionnalit�s");
		this.txt_subtitleRight.setFont(new Font("Serif",Font.BOLD, 28));
		this.txt_subtitleRight.setBounds(this.CENTER_PAN - 7, 0, (this.motherFrame.getWidth() *1) /2, this.BUTTON_HEIGHT);
	    right.add(txt_subtitleRight, BorderLayout.NORTH);
	    
		this.bt_creaPicture = new JButton("Creer une image");
		this.bt_creaPicture.addActionListener(this);
		this.bt_creaPicture.setBounds(this.CENTER_PAN, this.BUTTON_HEIGHT *2, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
		right.add(this.bt_creaPicture, BorderLayout.CENTER);
		
		this.bt_loadProg = new JButton("Envoyer un programme sur l'Arduino");
		this.bt_loadProg.addActionListener(this);
		this.bt_loadProg.setBounds(this.CENTER_PAN, this.BUTTON_HEIGHT *4, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
		right.add(this.bt_loadProg, BorderLayout.CENTER);
		
		this.bt_config = new JButton("Configurer le cube");
		this.bt_config.addActionListener(this);
		this.bt_config.setBounds(this.CENTER_PAN, this.BUTTON_HEIGHT *6, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
		right.add(this.bt_config, BorderLayout.CENTER);
		
		this.bt_exit = new JButton("Quitter");
		this.bt_exit.addActionListener(this);
		this.bt_exit.setBounds(this.CENTER_PAN, this.BUTTON_HEIGHT *8, this.BUTTON_WIDTH, this.BUTTON_HEIGHT);
		right.add(this.bt_exit, BorderLayout.CENTER);
		
		
		/* ------------------- Disposition des JPanels Gauche et Droit ------------------- */
		
		hight.setBounds(0, 0, this.motherFrame.getWidth(), this.motherFrame.getHeight()/3);
		left.setBounds(0, this.motherFrame.getHeight() /3 +1, 
				this.motherFrame.getWidth() /2, (this.motherFrame.getHeight() *2) /3);
		right.setBounds((this.motherFrame.getWidth() *1) /2 +1, this.motherFrame.getHeight() /3 +1, 
				this.motherFrame.getWidth() /2, (this.motherFrame.getHeight() *2) /3);
		this.add(hight);
		this.add(left);
		this.add(right);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton && ((JButton)e.getSource()).equals(this.bt_exit)){
			System.exit(1);
		}
		else if (e.getSource() instanceof JButton && ((JButton)e.getSource()).equals(this.bt_creaProg)){
			this.motherFrame.setContentPane(new ViewCreateProgram(motherFrame));
			this.updateUI();
		}			
		else if (e.getSource() instanceof JButton && ((JButton)e.getSource()).equals(this.bt_creaDraw)){
			this.motherFrame.setContentPane(new View2D(motherFrame));
		}
		else if(e.getSource() instanceof JButton && ((JButton)e.getSource()).equals(this.bt_crea3D)){
			 Thread view3D = new Thread(new View3D(this.motherFrame.getPolling()));
			 view3D.start();
		}
		else if (e.getSource() instanceof JButton && ((JButton)e.getSource()).equals(this.bt_loadProg)){
			JFileChooser saveFile = new JFileChooser();
			saveFile.setApproveButtonText("Envoyer");
			saveFile.showOpenDialog(this);
			File saveInFile = saveFile.getSelectedFile();
			if (saveInFile != null) {
				this.motherFrame.getPolling().sendFileToArduino(saveInFile);
			}
		}
		else if(e.getSource() instanceof JButton && ((JButton)e.getSource()).equals(this.bt_config)){
			new ConfigFrame(this.motherFrame.getPolling());
		}
		else if (e.getSource() instanceof JButton && ((JButton)e.getSource()).equals(this.bt_creaPicture))
		{
			new ViewCreateImage(motherFrame);
		}
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, this.motherFrame.getWidth(), this.motherFrame.getHeight());
	}
	
}