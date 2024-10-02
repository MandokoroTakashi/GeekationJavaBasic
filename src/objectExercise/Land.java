package objectExercise;

public class Land extends Property{
	private double pSize;
	
	Land(String pName, String pOwner, String pType, int pPrice, double pSize){
		
		super(pName, pOwner, pType, pPrice);
		this.pSize = pSize;
	}

	public double getPSize() {
		return this.pSize;
	}

	public void setPSize(double pSize) {
		this.pSize = pSize;
	}
	
	public void showData() {
		System.out.println("=============================");
		System.out.println("物件名：" + pName);
		System.out.println("物件所有者名：" + pOwner);
		System.out.println("物件種別：" + pType);
		System.out.println("物件価格：" + pPrice + "円");
		System.out.println("広さ：" + pSize + "㎡");
		System.out.println("=============================");
	}
}
