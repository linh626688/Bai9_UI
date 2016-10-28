package com.nac.bai9;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	public static void main(String[] args) {

		LookAndFeelInfo style[] = UIManager.getInstalledLookAndFeels();
		for (int i = 0; i < style.length; i++) {
			//System.out.println("STYLE: " + style[i].getClassName());
		}
		
		try {
			UIManager
					.setLookAndFeel(NimbusLookAndFeel.class.getName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new GUI().setVisible(true);
	}

}
