package sample;

public class TrumpetCreator extends AbstractCreator {

	@Override
	public WindInstrumentProduct createInstrument() {
		return new Trumpet();
	}

}
