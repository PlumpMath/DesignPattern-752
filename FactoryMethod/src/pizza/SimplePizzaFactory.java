package pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		//ピザ生成
		Pizza pizza = null;

		if(type.equals("チーズ")) {
			pizza = new CheesePizza();
		}else if(type.equals("ギリシャ")) {
			pizza = new GreekPizza();
		}else if(type.equals("ペパロニ")) {
			pizza = new PepperroniPizza();
		}else {
			pizza = new PlainPizza();
		}

		return pizza;
	}
}
