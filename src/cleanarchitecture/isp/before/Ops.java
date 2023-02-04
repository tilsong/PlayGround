package cleanarchitecture.isp.before;

public class Ops {
	// 3개의 다른 User 클래스가 Ops 클래스를 의존하고 있다.
	void booster1() {
		System.out.println("user1 booster");
	}

	void booster2() {
		System.out.println("user2 booster");
	}

	void booster3() {
		System.out.println("user3 booster");
	}
}
