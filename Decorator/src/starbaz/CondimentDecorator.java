package starbaz;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public abstract String getDescription();
}

class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}

	@Override
	public String getDescription() {
		return "ミルク" + beverage.getDescription();
	}
}

class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

	@Override
	public String getDescription() {
		return "モカ" + beverage.getDescription();
	}
}

class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}

	@Override
	public String getDescription() {
		return "豆乳" + beverage.getDescription();
	}
}

class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}

	@Override
	public String getDescription() {
		return "ホイップ" + beverage.getDescription();
	}
}