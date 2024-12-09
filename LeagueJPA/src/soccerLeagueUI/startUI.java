package soccerLeagueUI;

import java.util.List;

import soccerLeagueDAO.LeagueDAO;
import soccerLeagueDAO.emDAO;
import soccerLeaguePD.League;
import soccerLeaguePD.Player;
import soccerLeaguePD.Team;

public class startUI {

	public static void main(String[] args) {
		emDAO.initEM();
		final League league;
		List<League> leagues = LeagueDAO.listLeague();
		if( leagues.isEmpty() ) {
			league = new League();
			league.init();
			leagues = LeagueDAO.listLeague();
		} 
		else 
		{
		league = leagues.get(0);
		}
		if( args.length == 0 || !"-q".equals( args[0] ) ) {
			printLeague(league);
		}
		
		LeagueFrame.startGUI(league);
	}
	
	public static void printLeague(League league)
	{
		System.out.println("League Report");
		System.out.println("League :"+league.toString());
		System.out.println("Teams");
		for (Team team : league.getTeams())
		{
			emDAO.getEM().refresh(team);
			System.out.println(team.toString());
			System.out.println("--------------------------");
			for (Player player : team.getPlayers())
			{ 
				System.out.println(player.toString());
			}
			System.out.println("");
		}
	}

}
