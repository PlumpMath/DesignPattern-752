package akihisa.toyota.kj.kbc;

public class StrawberryDecorator extends Decorator {

	public StrawberryDecorator(Cake cake) {
		super(cake);
	}

	@Override
	public void display() {
		System.out.println("いちご付き");
		cake.display();
	}
}
