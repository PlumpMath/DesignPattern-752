package akihisa.toyota.kj.kbc;

/**
 * 普通のケーキのクラス
 * @author kbc11a08
 *
 */
public class PlainCake implements Cake {

	/**
	 * 画面にケーキの種類を表示する。
	 */
	@Override
	public void display() {
		System.out.println("普通のケーキ");
	}
}
