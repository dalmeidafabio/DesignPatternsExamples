package abstractfactory.store;

import abstractfactory.bill.BankOfAmericaBill;
import abstractfactory.bill.Bill;
import abstractfactory.invoice.Invoice;
import abstractfactory.invoice.InvoiceBahia;
import abstractfactory.sale.SaleFactory;

public class AppleStore implements SaleFactory {

	@Override
	public Invoice createInvoice() {
		Invoice invoice = new InvoiceBahia();
		return invoice;
	}

	@Override
	public Bill createBill() {
		Bill bill = new BankOfAmericaBill();
		return bill;
	}

}
