package abstractfactory;

import java.math.BigDecimal;

import abstractfactory.model.Product;
import abstractfactory.sale.Sale;
import abstractfactory.sale.SaleFactory;
import abstractfactory.store.AppleStore;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("iPhone X");
		product.setCode("012345789");
		product.setValue(new BigDecimal(5000.00));
		
		SaleFactory factory = new AppleStore();
		
		Sale sale = new Sale(factory);
		
		sale.makeSale(product);
	}
}
