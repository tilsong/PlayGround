package cleanarchitecture.isp.after;

public class User2 {
	U2Ops ops = new Ops();

	void run() {
		ops.booster2();
		System.out.println("User2 run");
	}
}
