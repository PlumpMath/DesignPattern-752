package pizza2;

public class NYStylePizzaStore extends PizzaStore {

	public NYStylePizzaStore(SimplePizzaFactory factory) {
		super(factory);
	}

	@Override
	Pizza createPizza(String type) {
		if(type.equals("チーズ")) {
			PizzaIngredientFactry pif = new NYPizzaIngredientFactry();
			return new NYStyleCheesePizza(pif);
		}else if(type.equals("野菜")) {
			return new NYStyleVeggiePizza();
		}
		return null;
	}

}