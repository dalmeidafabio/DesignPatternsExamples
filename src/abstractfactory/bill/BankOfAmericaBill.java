package abstractfactory.bill;

import java.math.BigDecimal;

import abstractfactory.model.Product;

public class BankOfAmericaBill implements Bill {

	@Override
	public void issue(Product product, BigDecimal tax) {
		System.out.println("BANK OF AMERICA");
		System.out.println("--------------------------------------");
		System.out.println("Name: " + product.getName());
		System.out.println("Value: " + product.getValue());
		System.out.println("Tax: " + tax);
	}

}
