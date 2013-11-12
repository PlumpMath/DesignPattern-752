package ensyu;

public abstract class Car {
	private String name;

	public void setName(String name)  {
		this.name = name;
	}

	public void printName() {
		System.out.println("車名：" + name);
	}

	public abstract void run();
}
