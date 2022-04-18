package abstractfactory.model;

import java.math.BigDecimal;

public class Product {
	
	private String code;
	private String name;
	private BigDecimal value;
	
	public BigDecimal getTotal(BigDecimal tax) {
		return value.add(value.multiply(tax));
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
