package abstractfactory.sale;

import java.math.BigDecimal;

import abstractfactory.bill.Bill;
import abstractfactory.invoice.Invoice;
import abstractfactory.model.Product;

public class Sale {

	private Invoice invoice;
	private Bill bill;
	
	public Sale(SaleFactory factory) {
		this.invoice = factory.createInvoice();
		this.bill = factory.createBill();
	}
	
	public void makeSale(Product product) {
		BigDecimal tax = invoice.calculateTax(product);
		bill.issue(product, tax);
	}
}
