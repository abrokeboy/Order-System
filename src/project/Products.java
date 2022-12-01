package project;

public class Products {
	private int productID;
	private String Name;
	private String Description;
	private float Cost;
	
	public Products(String name, String description, float cost) {
		super();
		Name = name;
		Description = description;
		Cost = cost;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getCost() {
		return Cost;
	}

	public void setCost(float cost) {
		Cost = cost;
	}

	@Override
	public String toString() {
		return "Products [productID=" + productID + ", Name=" + Name + ", Description=" + Description + ", Cost=" + Cost
				+ "]";
	}
	
	
}
