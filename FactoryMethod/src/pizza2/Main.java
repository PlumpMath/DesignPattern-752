package pizza2;

public class Main {
	public static void main(String[] args) {
		PizzaStore store = new NYStylePizzaStore(new SimplePizzaFactory());
		Pizza pizza = store.orderPizza("チーズ");
		System.out.println(pizza.getName());
	}

}
