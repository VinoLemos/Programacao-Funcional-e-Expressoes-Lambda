package entities;

public class Product implements Comparable<Product>{

	private String name;
	private Double price;
	
	public Product() {
		
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
// 	Predicate	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100;
	}
	
	
//	Consumer
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public  void nonStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
	}
	
	
//	Function
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("R$%.2f", price);
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
}