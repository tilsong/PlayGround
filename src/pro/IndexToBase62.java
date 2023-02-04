package pro;

import java.util.ArrayList;
import java.util.List;

public class IndexToBase62 {
	private static Object lock = new Object();
	private static List<Url> list = new ArrayList<>(); // DB 역할

	public static void main(String[] args) {

		// controller - param _ inputUrl
		String inputUrl = "www.naver.com"; // url validation 필요

		// service
		// repository <-> service
		int id = insertUrl(inputUrl);
		String encodedUrl = idToEncodedUrl(id);
		updateUrl(id, encodedUrl);

		// return encodedUrl;
	}

	private static String idToEncodedUrl(int id) {
		// id = 123456789
		// ==>





		return "";
	}

	private static int insertUrl(String inputUrl) { // db 코드
		int id;

		synchronized (lock) { 			// insert 및 index 값을 얻기 위한 동기화
			list.add(new Url(inputUrl));
			id = list.size() - 1;
		}

		return id;
	}

	private static void updateUrl(int index, String encodedUrl) {
		Url url = list.get(index);
		url.setEncodedUrl(encodedUrl);
	}
}
