package builder;

import java.math.BigDecimal;

import builder.builder.RequestBuilder;
import builder.domain.model.Request;

public class TestBuilder {

	public static void main(String[] args) {
		
		Request request = new RequestBuilder()
				.setClient(1234, "Fábio", "7199999999")
				.setProduct(10, new BigDecimal(55.00), "Mouse")
				.setProduct(5, new BigDecimal(15.00), "PenDrive")
				.setSalesman(00123, "Luiz")
				.builder();
		
		System.out.println(request.getClient().getName());
	}
}
