package abstractfactory.bill;

import java.math.BigDecimal;

import abstractfactory.model.Product;

public interface Bill {

	public void issue(Product product, BigDecimal tax);
}
