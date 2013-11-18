package ensyu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		AbstractDisplayString str = new DisplayString("test");
		Scanner sc = new Scanner(System.in);

		System.out.print("シングルクォートいる？(Y/N):");
		if(sc.nextLine().toUpperCase().toUpperCase().equals("Y"))
			str = new QuotedDecorator(str);

		System.out.print("中括弧いる？(Y/N):");
		if(sc.nextLine().toUpperCase().toUpperCase().equals("Y"))
			str = new ParenthesisDecorator(str);

		str.display();
	}
}
