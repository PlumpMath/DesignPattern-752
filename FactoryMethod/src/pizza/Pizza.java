package pizza;

public abstract class Pizza {

	//準備
	public void prepare() {
		System.out.println("生地の準備");
	}

	//焼く
	public void bake() {
		System.out.println("オーブンで焼く");
	}

	//切る
	public void cut() {
		System.out.println("等分に分割");
	}

	//箱詰め
	public void box() {
		System.out.println("箱に入れる");
	}
}


/*--------------------------------------------------*/
class PlainPizza extends Pizza {

}


/*--------------------------------------------------*/
class CheesePizza extends Pizza {

}


/*--------------------------------------------------*/
class GreekPizza extends Pizza {

}


/*--------------------------------------------------*/
class PepperroniPizza extends Pizza {

}



/*--------------------------------------------------*/
class NYStyleCheesePizza extends Pizza {

}



/*--------------------------------------------------*/
class NYStyleVeggiePizza extends Pizza {

}
