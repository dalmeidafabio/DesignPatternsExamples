package builder.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import builder.domain.model.Client;
import builder.domain.model.Product;
import builder.domain.model.Request;
import builder.domain.model.Salesman;

public class RequestBuilder {

	private Request instance;
	
	public RequestBuilder() {
		this.instance = new Request();
	}
	
	public RequestBuilder setRequest(String requestNumber) {
		instance.setRequestNumber(requestNumber);
		return this;
	}
	
	public RequestBuilder setClient(int code, String name, String phone) {
		Client client = new Client();
		client.setCode(code);
		client.setName(name);
		client.setPhone(phone);
		
		instance.setClient(client);
		return this;
	}
	
	public RequestBuilder setSalesman(int code, String name) {
		Salesman salesman = new Salesman();
		salesman.setCode(code);
		salesman.setName(name);
		
		instance.setSalesman(salesman);
		
		return this;
	}
	
	public RequestBuilder setProduct(int quantity, BigDecimal value, String name) {
		Product product = new Product();
		product.setName(name);
		product.setQuantity(quantity);
		product.setValue(value);
		
		if(instance.getProducts() == null) {
			instance.setProducts(new ArrayList<>());
		}
		
		instance.getProducts().add(product);
		
		return this;
	}
	
	public Request builder() {
		return instance;
	}
}
