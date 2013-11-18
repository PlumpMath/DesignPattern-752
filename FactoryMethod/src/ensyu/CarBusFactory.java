package ensyu;

public class CarBusFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new CarBus();
	}

}
