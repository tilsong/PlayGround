package processSynchronization;

public class RaceCondition {

	public static void main(String[] args) {
		new Thread(() -> {
			for (long i = 0; i < 10000000; i++) {
				SharedData.add();
			}
		}).start();
		new Thread(() -> {
			for (long i = 0; i < 10000000; i++) {
				SharedData.minus();
			}
		}).start();

		System.out.println("expect data: 0");
		System.out.println("but data: " + SharedData.data);
	}

}

class SharedData {
	public static long data = 0;
	static void add() {
		data++;
	}

	static void minus() {
		data--;
	}
}