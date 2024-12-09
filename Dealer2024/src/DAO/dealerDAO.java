package DAO;

import java.util.List;
import jakarta.persistence.TypedQuery;
import dealerPD.Dealer;

public class dealerDAO {

public static void addDealer(Dealer dealer) {
		EM.getEM().persist(dealer);
	}
		
	public static void saveDealer(Dealer dealer) {
		EM.getEM().persist(dealer);
	}

	public static List<Dealer> listDealer() {
		TypedQuery<Dealer> query = EM.getEM().createQuery(
				"SELECT dealer FROM dealer dealer", Dealer.class);
		return query.getResultList();
	}

	public static Dealer findDealerById(int id) {
		Dealer dealer = EM.getEM()
.find(Dealer.class, new Integer(id));
		return dealer;
	}
	
	public static void removeDealer(Dealer dealer) {
		EM.getEM().remove(dealer);
	}

}