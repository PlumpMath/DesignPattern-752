package sample;

public class SaxophoneCreator extends AbstractCreator {

	@Override
	public WindInstrumentProduct createInstrument() {
		return new Saxophone();
	}
}
