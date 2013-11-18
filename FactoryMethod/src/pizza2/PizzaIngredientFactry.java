package pizza2;

public interface PizzaIngredientFactry {
	Dough createDough();
	Sauce createSouce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClams();
}

class NYPizzaIngredientFactry implements PizzaIngredientFactry{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSouce() {
		return new MarinaraSouce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies vessies[] = {new Garlic(), new Onion()};
		return vessies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicePepperoni();
	}

	@Override
	public Clams createClams() {
		return new NYClams();
	}

}