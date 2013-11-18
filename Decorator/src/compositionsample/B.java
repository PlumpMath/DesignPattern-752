package compositionsample;

//委譲
public class B {
	Base b = new Base();

	public int methodA() {
		return b.methodA();
	}

	public int methodB() {
		return b.methodB();
	}

	public int methodC() {
		return b.methodA() + b.methodB();
	}
}
