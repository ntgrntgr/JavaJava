package soccerLeagueDAO;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

import soccerLeaguePD.Location;
import soccerLeaguePD.Team;

public class LocationDAO {	

		public static void saveLocation(Location location) {
			emDAO.getEM().persist(location);
		}
			public static void addLocation(Location location) {
				emDAO.getEM().persist(location);
			}

			public static ArrayList<Location> listLocation() {
				Query query = emDAO.getEM().createQuery("SELECT location FROM location location");
				ArrayList<Location> list= (ArrayList) query.getResultList();

				return list;
			}

			public static Location findLocationById(int id) {
				Location Location = emDAO.getEM().find(Location.class, new Integer(id));
				return Location;
			}

			public static void removeLocation(Location location) {
				emDAO.getEM().remove(location);
				
			}

	public static List<Team> listTeam() {
		TypedQuery<Team> query = emDAO.getEM().createQuery(
				"SELECT team FROM team team", Team.class);
		return query.getResultList();
	}

}
