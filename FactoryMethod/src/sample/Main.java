package sample;

public class Main {
	public static void main(String[] args) {
		AbstractCreator ac = new SaxophoneCreator();
		ac.setName("俺のサックス");
		WindInstrumentProduct product = ac.create();
		product.printPlate();
		product.play();

		ac = new TrumpetCreator();
		ac.setName("私のトランペット");
		product = ac.create();
		product.printPlate();
		product.play();
	}

}
