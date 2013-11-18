package pizza2;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	ArrayList toppings = new ArrayList();

	//準備
	public abstract void prepare();

	//焼く
	public void bake() {
		System.out.println("オーブンで焼く");
	}

	//切る
	public void cut() {
		System.out.println("等分に分割");
	}

	//箱詰め
	public void box() {
		System.out.println("箱に入れる");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		String str = "";
		return null;
	}
}

/*--------------------------------------------------*/
class PlainPizza extends Pizza {

}

/*--------------------------------------------------*/
class CheesePizza extends Pizza {

	PizzaIngredientFactry ingredientFactry;

	public CheesePizza(PizzaIngredientFactry pif) {
		ingredientFactry = pif;
	}

	@Override
	public void prepare() {
		this.setName("CheesePizza");
		System.out.println(name + "を下処理");
		dough = ingredientFactry.createDough();
		sauce = ingredientFactry.createSouce();
		cheese = ingredientFactry.createCheese();
		clam = ingredientFactry.createClams();
	}

}

/*--------------------------------------------------*/
class GreekPizza extends Pizza {

}

/*--------------------------------------------------*/
class PepperroniPizza extends Pizza {

}

/*--------------------------------------------------*/
class NYStyleCheesePizza extends CheesePizza {

	public NYStyleCheesePizza(PizzaIngredientFactry pif) {
		super(pif);
	}

	@Override
	public void prepare() {
		super.prepare();
	}

}

/*--------------------------------------------------*/
class NYStyleVeggiePizza extends Pizza {

}
