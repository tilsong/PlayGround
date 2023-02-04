package cleanarchitecture.isp.after;

public class User1 {
	U1Ops ops = new Ops();

	void run() {
		ops.booster1();
		System.out.println("User1 run");
	}
}
