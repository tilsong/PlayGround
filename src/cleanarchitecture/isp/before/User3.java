package cleanarchitecture.isp.before;

public class User3 {
	Ops ops = new Ops();

	void run() {
		ops.booster3();
		System.out.println("User3 run");
	}
}
