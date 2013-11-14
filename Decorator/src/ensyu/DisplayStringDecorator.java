package ensyu;

public abstract class DisplayStringDecorator implements AbstractDisplayString {

	protected AbstractDisplayString ads;

	public DisplayStringDecorator(AbstractDisplayString ads) {
		this.ads = ads;
	}
}
