package soccerLeagueUI;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import soccerLeaguePD.League;

public class MainPanel extends JPanel {


	
	/**
	 * Create the panel.
	 */
	public MainPanel(League league) {
	
		setLayout(null);
		

		JLabel lblNewLabel = new JLabel(league.getName());
	
		lblNewLabel.setBounds(112, 112, 230, 16);
	  add(lblNewLabel);
	}
}
