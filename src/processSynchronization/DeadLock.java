package processSynchronization;

public class DeadLock {
	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();

		new Thread(() -> {
			// 1. lock1의 락 선점
			synchronized (lock1) {
				System.out.println("Get lock1");

				// 3. lock1의 락을 얻은 상태로 sleep
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}

				// 5. 선점되어 있는 lock2의 락을 얻기 위해 대기
				synchronized (lock2) {
					System.out.println("Get lock2");
				}
			}
		}).start();

		new Thread(() -> {
			// 2. lock2의 락 선점
			synchronized (lock2) {
				System.out.println("Get lock2");

				// 4. 선점되어 있는 자원(lock1)을 얻기 위해 대기.
				synchronized (lock1) {
					System.out.println("Get lock1");
				}
			}
		}).start();
	}
}