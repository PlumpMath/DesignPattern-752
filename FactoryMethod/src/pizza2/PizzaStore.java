package pizza2;

public abstract class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		//ピザ生成
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = factory.createPizza(type);

		//ピザ加工
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract Pizza createPizza(String type);
}
