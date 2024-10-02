package objectExercise;

public class Property {
	protected String pName;
	protected String pOwner;
	protected String pType;
	protected int pPrice;
	
	Property(String pName, String pOwner, String pType, int pPrice){
		this.pName = pName;
		this.pOwner = pOwner;
		this.pType = pType;
		this.pPrice = pPrice;
	}
	
	public String getPName() {
		return this.pName;
	}
	
	public String getPOwner() {
		return this.pOwner;
	}
	
	public String getPType() {
		return this.pType;
	}
	
	public int getPPrice() {
		return this.pPrice;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public void setPOwner(String pOwner) {
		this.pOwner = pOwner;
	}
	
	public void setPTyep(String pType) {
		this.pType = pType;
	}
	
	public void setPPrice(int pPrice) {
		this.pPrice = pPrice;
	}
}
