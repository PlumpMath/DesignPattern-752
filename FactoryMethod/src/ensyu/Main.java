package ensyu;

public class Main {
	public static void main(String[] args) {
		CarFactory cf = new CarBusFactory();
		cf.setName("すごいバス");
		Car c = cf.create();
		c.printName();
		c.run();

		cf = new CarTruckFactory();
		cf.setName("よわいトラック");
		c = cf.create();
		c.printName();
		c.run();
	}
}
