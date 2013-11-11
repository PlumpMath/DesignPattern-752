package sample;

public abstract class AbstractCreator {

	private String name;

	private void mark(WindInstrumentProduct product) {
		product.setPlate(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public WindInstrumentProduct create() {
		//オブジェクトの生成を隠す
		WindInstrumentProduct product = createInstrument();

		mark(product);
		return product;
	}

	public abstract WindInstrumentProduct createInstrument();
}
