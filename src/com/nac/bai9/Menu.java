package com.nac.bai9;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel /*implements ActionListener*/ {
	// Tao 1 label de lam hinh nen
	private JLabel lbPlayGame;
	// Anh xa gui tu MyContainer
	private GUI gui;

	// Khai bao cac icon
	private ImageIcon playIcon, optionIcon, highScoreIcon, exitIcon,
			backgroundIcon;
	// Khoi tao padding khoang cach giua cac button
	private final int PADDING = 10;

	// Khai bao cac label chuc nang
	private JLabel lbOption;
	private JLabel lbHighScore;
	private JLabel lbExit;
	// Khai bao them label de lam background
	private JLabel lbBackground;


	// Phuong thuc khoi tao de anh xa GUI sang
	public Menu(GUI gui) {
		this.gui = gui;
		// Set mau nen
		setBackground(Color.YELLOW);
		// Set bo tri lay out la null
		setLayout(null);
		// Goi phuong tuc khoi tao cac icon
		initIcons();
		// Goi phuong thuc khoi tao cac label chuc nang
		initComps();
		// Goi phuong thuc khoi tao label background
		initBackground();
	}

	// Phuong thuc khoi tao label background
	public void initBackground() {
		lbBackground = new JLabel();
		// Set vi tri tai toa do 0,0
		// Set kich thuoc la full JFrame
		lbBackground.setBounds(0, 0, gui.getWidth(), gui.getHeight());

		// Set icon la hinh nen
		lbBackground.setIcon(backgroundIcon);

		// Add vao Menu
		add(lbBackground);
	}

	// Phuong thuc khoi tao cac icon
	private void initIcons() {
		// Khoi tao icon play
		playIcon = new ImageIcon(getClass().getResource("/IMAGE/play.png"));
		// Khoi tao icon option
		optionIcon = new ImageIcon(getClass().getResource("/IMAGE/option.png"));
		// Khoi tao icon high score
		highScoreIcon = new ImageIcon(getClass().getResource(
				"/IMAGE/highscore.png"));
		// Khoi tao icon exit
		exitIcon = new ImageIcon(getClass().getResource("/IMAGE/exit.png"));
		// Khoi tao icon background
		backgroundIcon = new ImageIcon(getClass().getResource(
				"/IMAGE/background.png"));
	}

	// Phuong thuc khoi tao 1 label
	// Tra ve 1 doi tuong label sau khi khoi tao
	public JLabel initlabel(String text, Color color, int x, int y,
			ImageIcon icon) {
		// Khoi tao 1 label
		JLabel label = new JLabel();

		// label = new JLabel(text);
		// label.setForeground(color);
		
		//Set vi tri va kich thuoc cua label theo Icon
		label.setBounds(x, y, icon.getIconWidth(),icon.getIconHeight());
		
		//SetIcon cho label
		label.setIcon(icon);
		
		//label.setHorizontalAlignment(SwingConstants.LEFT);
		// label.addActionListener(this);

		//Add vao Menu
		add(label);

		//Tra ve 1 doi tuong label
		return label;
	}
	
	//Khoi tao cac doi tuong label
	public void initComps() {
		//Khoi tao doi label PlayGame
		//Truyen vao text, mau sac text, x, y, w,h
		lbPlayGame = initlabel("PLAY GAME", Color.BLUE,
				(gui.getWidth() - 150) / 2, ((gui.getHeight() - 50) / 2 - 50),
				playIcon);
		
		lbOption = initlabel("OPTION", Color.BLUE, (gui.getWidth() - 150) / 2,
				lbPlayGame.getY() + lbPlayGame.getHeight() + PADDING,
				optionIcon);
		
		lbHighScore = initlabel("HIGH SCORE", Color.BLUE,
				(gui.getWidth() - 150) / 2,
				lbOption.getY() + lbOption.getHeight() + PADDING, highScoreIcon);
		
		lbExit = initlabel("EXIT", Color.BLUE, (gui.getWidth() - 150) / 2,
				lbHighScore.getY() + lbHighScore.getHeight() + PADDING,
				exitIcon);
	}
	//
	// @Override
	// public void actionPerformed(ActionEvent e) {
	// if (e.getSource() == lbExit) {
	// gui.dispose();
	// }
	// }
}
