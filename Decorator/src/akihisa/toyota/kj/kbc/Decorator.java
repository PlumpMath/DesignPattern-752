package akihisa.toyota.kj.kbc;

public abstract class Decorator implements Cake {

	protected Cake cake;

	public Decorator(Cake cake) {
		this.cake = cake;
	}

	@Override
	public void display() {

	}
}
