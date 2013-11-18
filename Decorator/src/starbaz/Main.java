package starbaz;

public class Main {
	public static void main(String[] args) {
		Beverage b = new Espresso();
		b = new Soy(b);
		b = new Milk(b);

		System.out.println("商品名：" + b.getDescription());
		System.out.println("値段：" + b.cost());
	}
}
