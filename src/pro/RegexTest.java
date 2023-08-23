package pro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		String text = "";// "https://www.naver.com";
		Pattern p = Pattern.compile("^(?:https?:\\/\\/)(?:www\\.)?[a-zA-Z0-9./]+$");
		Matcher m = p.matcher(text);

		System.out.println("text: " + m.matches());
	}

}
