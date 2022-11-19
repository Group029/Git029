package assignmentno5;

import java.util.Objects;

public class Shirt {
	private String brandName;
	private String color;
	private String type;
	private int price;
	
	public Shirt(String brandName, String color, String type, int price) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.type = type;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Shirt() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, color, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shirt other = (Shirt) obj;
		return Objects.equals(brandName, other.brandName) && Objects.equals(color, other.color) && price == other.price
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Shirt [brandName=" + brandName + ", color=" + color + ", type=" + type + ", price=" + price + "]";
	}

	
	
}
