package cleanarchitecture.isp.after;

public class Ops implements U1Ops, U2Ops, U3Ops {
	// 인터페이스를 구현하였으므로, 원하는 인터페이스를 의존하여 사용할 수 있다.
	// 구현 객체에 의존하지 않게 됨.
	public void booster1() {
		System.out.println("user1 booster");
	}

	public void booster2() {
		System.out.println("user2 booster");
	}

	public void booster3() {
		System.out.println("user3 booster");
	}
}
