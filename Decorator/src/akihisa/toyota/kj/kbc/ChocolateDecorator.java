package akihisa.toyota.kj.kbc;

public class ChocolateDecorator extends Decorator {

	public ChocolateDecorator(Cake cake) {
		super(cake);
	}

	@Override
	public void display() {
		System.out.println("チョコレート付き");
		cake.display();
	}
}
