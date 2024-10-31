package posTest;
import posPD.*;

public class storeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long Id = 00001L;
		//Long newId = Id;
		
		Cashier Mugisha = new Cashier(Id,"newpassword","Mugisha","2501 E Memorial rd","Edmond","Oklahoma","73013","585-439-0505","111111111");
		System.out.println(Mugisha.toString());
	}

}
