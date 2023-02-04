package cleanarchitecture.srpFacade.solution1;

public class Main {
	public static void main(String[] args) {
		// 해결책 1 - 데이터와 메서드를 분리
		// 데이터 클래스를 만들고, 이를 3 클래스가 공유한다.
		//
		// 개발자가 세 가지 클래스를 인스턴스화하고 추적해야 한다는 단점을 가진다.
		// -> solution2로 해결(facade 패턴 사용)

		// 접근 동시성 고려 x
		EmployeeData ed = EmployeeData.getEmployeeDate();

		if (args[0].equals("CFO")) {
			PayCalculator pc = new PayCalculator(ed);
			System.out.println("CFO is working.");
			pc.calculatePay();
		} else if (args[0].equals("COO")) {
			HourReporter hp = new HourReporter(ed);
			System.out.println("COO is working.");
			hp.reportHours();
		} else if (args[0].equals("CTO")) {
			EmployeeSaver es = new EmployeeSaver(ed);
			System.out.println("CTO is working.");
			es.save();
		} else {
			System.out.println("wrong input.");
			return;
		}

	}
}
