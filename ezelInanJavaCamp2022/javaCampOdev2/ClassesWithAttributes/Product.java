package ClassesWithAttributes;

public class Product {
	//parameter constructor
	public Product(int id, String name,String description, double price,int stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		this.id =id;
		this.name =name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	public Product() {}//bu şekildede kullanabiliriz.
	
	//attribute and /or field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	/**
	 * @return the id
	 */
	public int getId() {// getter read only'dir.
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {//kodu yazılabilir hale getirmek için kullanılan setter dır 
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	} 
}//attribute or field

