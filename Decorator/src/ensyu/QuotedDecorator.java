package ensyu;

public class QuotedDecorator extends DisplayStringDecorator {

	public QuotedDecorator(AbstractDisplayString ads) {
		super(ads);
	}

	@Override
	public void display() {
		System.out.print("'");
		ads.display();
		System.out.print("'");
	}
}
