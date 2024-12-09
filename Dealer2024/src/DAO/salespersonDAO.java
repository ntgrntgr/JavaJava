package DAO;

import java.util.List;
import jakarta.persistence.TypedQuery;
import dealerPD.SalesPerson;

public class salespersonDAO {

public static void addSalesperson(SalesPerson salesperson) {
		EM.getEM().persist(salesperson);
	}
		
	public static void saveSalesperson(SalesPerson salesperson) {
		EM.getEM().persist(salesperson);
	}

	public static List<SalesPerson> listSalesperson() {
		TypedQuery<SalesPerson> query = EM.getEM().createQuery(
"SELECT salesperson FROM salesperson salesperson", SalesPerson.class);
		return query.getResultList();
	}

	public static SalesPerson findSalespersonById(int id) {
		SalesPerson salesperson = EM.getEM()
.find(SalesPerson.class, new Integer(id));
		return salesperson;
	}
	
	public static void removeSalesperson(SalesPerson salesperson) {
		EM.getEM().remove(salesperson);
	}

}