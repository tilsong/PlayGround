package ErrorCheck;

public class Main {
	public static void main(String[] args) {
		Error1 e1 = new Error1();

		try {
			System.out.println("Main start");
			e1.errorGo();
			System.out.println("Main end");
		} catch (Exception e) {
			System.out.println(e.getClass());
		}

		System.out.println("real end");

	}
}

class Error1 {
	void errorGo() throws Exception {
		System.out.println("error1 start");
	}
}