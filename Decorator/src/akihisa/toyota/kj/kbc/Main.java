package akihisa.toyota.kj.kbc;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Cake cake = new PlainCake();

		Scanner sc = new Scanner(System.in);

		System.out.print("チョコレートいる？(Y/N):");
		if(sc.nextLine().toUpperCase().toUpperCase().equals("Y"))
			cake = new ChocolateDecorator(cake);

		System.out.print("イチゴいる？(Y/N):");
		if(sc.nextLine().toUpperCase().equals("Y"))
			cake = new StrawberryDecorator(cake);

		System.out.print("クリームいる？(Y/N):");
		if(sc.nextLine().toUpperCase().equals("Y"))
			cake = new CreamDecorator(cake);

		cake.display();
	}

}
