package objectExercise;

public class Apartment extends Property{
	private String pLayout;
	
	Apartment(String pName, String pOwner, String pType, int pPrice, String pLayout){
		
		super(pName, pOwner, pType, pPrice);
		this.pLayout = pLayout;
	}
	
	public String getPLayout() {
		return this.pLayout;
	}

	public void setPLayout(String pLayout) {
		this.pLayout = pLayout;
	}
	
	public void showData() {
		System.out.println("=============================");
		System.out.println("物件名：" + pName);
		System.out.println("物件所有者名：" + pOwner);
		System.out.println("物件種別：" + pType);
		System.out.println("物件価格：" + pPrice + "円");
		System.out.println("間取り：" + pLayout);
		System.out.println("=============================");
	}

}
