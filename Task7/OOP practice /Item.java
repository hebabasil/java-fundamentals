
package package1;

public class Item {
	private String name ;
	private double price ;
	

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price <= 0) {
			System.out.println("The price should be > 0");
        }else {
        this.price = price;
	} 
	
	
	}
}
