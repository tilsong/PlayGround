package cleanarchitecture.isp.before;

public class User2 {
	Ops ops = new Ops();

	void run() {
		ops.booster2();
		System.out.println("User2 run");
	}
}
