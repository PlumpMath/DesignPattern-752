package sample;

public class UpDownBorder extends Border {
	private char borderChar; // 飾りとなる文字

	public UpDownBorder(Display display, char borderChar) {
		super(display);
		this.borderChar = borderChar;
	}

	@Override
	public int getColumns() {
		return display.getColumns();
	}

	@Override
	public int getRows() {
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0) { // 上端の枠
			return makeLine(borderChar, display.getColumns());
		} else if (row == display.getRows() + 1) { // 下端の枠
			return makeLine(borderChar, display.getColumns());
		} else { // それ以外
			return display.getRowText(row - 1);
		}
	}

	private String makeLine(char ch, int count) { // 文字chをcount個連続させた文字列を作る
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}
		return buf.toString();
	}

}
