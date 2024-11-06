package posTest;
import java.math.BigDecimal;

import posPD.*;

public class storeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long Id = 00001L;
		BigDecimal sampleBigDecimal = new BigDecimal("2.29");
		Price samplePrice = new Price(sampleBigDecimal,"Sample Price","today");
		//Long newId = Id;
		
		Cashier Mugisha = new Cashier(Id,"newpassword","Mugisha","2501 E Memorial rd","Edmond","Oklahoma","73013","585-439-0505","111111111", CashierRoles.CLERK);
		System.out.println(Mugisha.toString());
	}

}
