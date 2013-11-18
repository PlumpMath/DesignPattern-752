package sample.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


public class PageMaker {
	private PageMaker() {
	}

	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + "'s page!");
			writer.paragraph(username + "のページへようこそ。");
			writer.paragraph("メール待っていますね。");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void makeLikePage(String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Link page");
			for(Entry<Object, Object> set : mailprop.entrySet()) {
				writer.link((String)set.getKey(), (String)set.getValue());
			}
			writer.close();
			System.out.println(filename + " is created");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
