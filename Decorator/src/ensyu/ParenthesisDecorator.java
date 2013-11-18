package ensyu;

public class ParenthesisDecorator extends DisplayStringDecorator {

	public ParenthesisDecorator(AbstractDisplayString ads) {
		super(ads);
	}

	@Override
	public void display() {
		System.out.print("{");
		ads.display();
		System.out.print("}");
	}
}
