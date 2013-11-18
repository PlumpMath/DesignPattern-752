package ensyu;

public class DisplayString implements AbstractDisplayString {

	protected String string;

	public DisplayString(String string) {
		this.string = string;
	}

	@Override
	public void display() {
		System.out.print(this.toString());
	}

	public String toString() {
		return string;

	}
}
