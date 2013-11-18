package sample;

public abstract class WindInstrumentProduct {

	private String plate;

	//ネームプレートをつける
	public void setPlate(String plate) {
		this.plate = plate;
	}

	public void printPlate() {
		System.out.println("名前：" + plate);
	}

	//演奏テスト
	public abstract void play();
}
