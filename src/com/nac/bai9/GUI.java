package com.nac.bai9;

import javax.swing.JFrame;

public class GUI extends JFrame {
	private int widthFrame = 800;
	private int heightFrame = 500;

	private MyContainer mContainer;

	public void setMyContainer(MyContainer mContainer) {
		this.mContainer = mContainer;
	}

	public GUI() {
		setSize(widthFrame, heightFrame);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mContainer = new MyContainer(this);
		
		add(mContainer);
	}
}
