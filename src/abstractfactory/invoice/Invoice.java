package abstractfactory.invoice;

import java.math.BigDecimal;

import abstractfactory.model.Product;

public interface Invoice {

	public BigDecimal calculateTax(Product product);
}
