package com.nac.bai9;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MyContainer extends JPanel {
	private static final String TAG_MENU = "tag_menu";

	private CardLayout mCardLayout;

	private Menu menu;
	
	public MyContainer(GUI gui) {

		setBackground(Color.WHITE);
		mCardLayout=new CardLayout();
		setLayout(mCardLayout);
		menu=new Menu(gui);

		add(menu,TAG_MENU);
		
	}
}
