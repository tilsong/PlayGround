package cleanarchitecture.isp.before;

public class User1 {
	Ops ops = new Ops();

	void run() {
		ops.booster1();
		System.out.println("User1 run");
	}
}
