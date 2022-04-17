package builder.domain.model;

import java.math.BigDecimal;
import java.util.List;

public class Request {

	private String requestNumber;
	private List<Product> products;
	private Client client;
	private Salesman salesman;
	
	public BigDecimal getTotalValue() {
		BigDecimal total = BigDecimal.ZERO;
		
		for(Product product : products) {
			total = total.add(product.getValue().multiply(new BigDecimal(product.getQuantity())));
		}
		
		return total;
	}
	
	public int getTotalQuantity() {
		int total = 0;
		
		for(Product product : products) {
			total += product.getQuantity();
		}
		
		return total;
	}

	public String getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}
}
