package pizza;

public class NYStylePizzaStore extends PizzaStore {

	public NYStylePizzaStore(SimplePizzaFactory factory) {
		super(factory);
	}

	@Override
	Pizza createPizza(String type) {
		if(type.equals("チーズ")) {
			return new NYStyleCheesePizza();
		}else if(type.equals("野菜")) {
			return new NYStyleVeggiePizza();
		}
		return null;
	}

}