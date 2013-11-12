package ensyu;

public class CarTruckFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new CarTruck();
	}

}
