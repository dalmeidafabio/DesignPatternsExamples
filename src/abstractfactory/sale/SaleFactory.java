package abstractfactory.sale;

import abstractfactory.bill.Bill;
import abstractfactory.invoice.Invoice;

public interface SaleFactory {

	public Invoice createInvoice();
	
	public Bill createBill();
}
