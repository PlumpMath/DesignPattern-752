package ensyu;

public abstract class CarFactory {

	private String name;

	private void mark(Car c) {
		c.setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car create() {
		Car c = createCar();

		mark(c);

		return c;
	}

	public abstract Car createCar();
}
