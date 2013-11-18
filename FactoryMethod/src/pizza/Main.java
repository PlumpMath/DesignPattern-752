package pizza;

public class Main {
	public static void main(String[] args) {
		PizzaStore store = new NYStylePizzaStore(new SimplePizzaFactory());
		Pizza pizza = store.orderPizza("");
		System.out.println(pizza);
	}

}
