package abstractfactory.invoice;

import java.math.BigDecimal;

import abstractfactory.model.Product;

public class InvoiceBahia implements Invoice {

	@Override
	public BigDecimal calculateTax(Product product) {
		
		BigDecimal tax = new BigDecimal("0.18");
		
		return tax.multiply(product.getValue());
	}

}
