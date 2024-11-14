package posTest;
import java.math.BigDecimal;
import java.time.LocalDate;

import posPD.*;

public class storeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long Id = 00001L;
		Long sampleID = Id + 1L;
		Long sampleIdTwo = Id + 2L;
		Long sampleLong = 1111L;
		Long sampleLongTwo = sampleLong + 1L;
		Long sampleLongThree = sampleLong + 2L;
		BigDecimal sampleBigDecimal = new BigDecimal("2.29");
		BigDecimal sampleRate = new BigDecimal("0.07");
		LocalDate today = LocalDate.now();
		LocalDate anotherSampleDate = LocalDate.of(2022, 1, 1);
		//System.out.println(anotherSampleDate);
		Price samplePrice = new Price(sampleBigDecimal,"Sample Price",today);
		Price samplePriceTwo = new Price(sampleBigDecimal.add(new BigDecimal("1")), "Sample Price Two", today.plusDays(1L));
		Price samplePriceThree = new Price(sampleBigDecimal.add(new BigDecimal("2")),"Sample Price Three", today.plusDays(2L));
		//System.out.println(samplePrice.getDescription() + " " + samplePrice.getPrice() + " " + samplePrice.getEffectiveDate());
		//System.out.println(samplePriceTwo.getDescription() + " " + samplePriceTwo.getPrice() + " " + samplePriceTwo.getEffectiveDate());
		//System.out.println(samplePriceThree.getDescription() + " " + samplePriceThree.getPrice() + " " + samplePriceThree.getEffectiveDate()); 
	
		TaxCategory sampleTaxCategory = new TaxCategory("Digital Goods");
		TaxCategory sampleTaxCategoryTwo = new TaxCategory("Alcohol & Tobacco");
		TaxCategory sampleTaxCategoryThree = new TaxCategory("Food & Beverages");
		
		TaxRate sampleTaxRate = new TaxRate(anotherSampleDate,sampleRate,"Standard rate");
		TaxRate sampleTaxRateTwo = new TaxRate(anotherSampleDate.plusDays(1L),sampleRate.add(new BigDecimal("0.05")),"Holiday-Special");
		TaxRate sampleTaxRateThree = new TaxRate(anotherSampleDate.plusDays(2L),sampleRate.add(new BigDecimal("0.15")),"Easter-Special");
		sampleTaxCategory.addTaxRate(sampleTaxRate);
		sampleTaxCategory.addTaxRate(sampleTaxRateTwo);
		sampleTaxCategory.addTaxRate(sampleTaxRateThree);
		
		
		UPC sampleUPC = new UPC(sampleLong);
		UPC sampleUPCTwo = new UPC(sampleLongTwo);
		UPC sampleUPCThree = new UPC(sampleLongThree);
		
		Item sampleItem = new Item("Transmission");
		Item sampleItemTwo = new Item("Windshields");
		Item sampleItemThree = new Item("Brake Fluid");
		
		sampleItem.setUPC(sampleUPC);
		sampleItemTwo.setUPC(sampleUPCTwo);
		sampleItemThree.setUPC(sampleUPCThree);
		
		//System.out.println(samplePriceThree.getEffectiveDate() + " " + samplePriceThree.getPrice());
		
		sampleItem.addPrice(samplePrice, "Standard");
		sampleItemTwo.addPrice(samplePriceTwo,"Standard");
		sampleItemThree.addPrice(samplePriceThree,"Standard");
		
		//System.out.println(sampleTaxCategory.toString());
		Cashier Mugisha = new Cashier(Id,"newpassword","Mugisha","2501 E Memorial rd","Edmond","Oklahoma","73013","585-439-0505","111111111", CashierRoles.CLERK);
		Cashier Manzi = new Cashier(sampleID,"ManziPassword","Manzi","2501 E Memorial rd", "Edmond","Oklahoma","73013","585-123-1234","222222222",CashierRoles.CLERK);
		Cashier Muhire = new Cashier(sampleIdTwo,"MuhirePassword","Muhire","2501 E Memorial rd","Norman","Oklahoma","73213","405-123-1234","333333333",CashierRoles.MANAGER);
		System.out.println(Mugisha.toString() +"\n" + Manzi.toString() + "\n" + Muhire.toString());
		
		//System.out.println(today);
		//System.out.println(Id);
		//System.out.println(sampleTaxRate.toString());
		
		Store sampleStore = new Store("Chrome_Wheels");
		System.out.println("---- " +sampleStore.getName() + " -- Store");
		//System.out.println(sampleItem.toString());
		//System.out.println(sampleItemTwo.toString());
		//System.out.println(sampleItemThree.toString());
		
		
		sampleStore.addItem(sampleItem);
		sampleStore.addItem(sampleItemTwo);
		sampleStore.addItem(sampleItemThree);
		
		Item sampleItemFour = new Item("Brake Pads");
		UPC sampleUPCFour = new UPC(sampleStore.getUpcsCount());
		sampleUPCFour.setUPC(sampleUPCFour.getUPC());
		
		System.out.println(sampleStore.toString());
		//System.out.println(sampleStore.getItemCount());
		//System.out.println(sampleLongThree);
		//System.out.println(sampleUPC.toString() + " " + sampleUPCTwo.toString() + " " + sampleUPCThree.toString());
		
	}

}
