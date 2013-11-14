package starbaz;

public abstract class Beverage {
	protected String description;

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}

class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "ハウスブレンド";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}

class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "ダークロースト";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}

class Espresso extends Beverage {
	public Espresso() {
		description = "エスプレッソ";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}

class Decaf extends Beverage {
	public Decaf() {
		description = "カフェイン抜き";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}