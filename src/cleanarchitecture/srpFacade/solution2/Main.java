package cleanarchitecture.srpFacade.solution2;

import cleanarchitecture.srpFacade.solution1.EmployeeData;

public class Main {
	public static void main(String[] args) {
		Facade fc = new Facade(); // 파사드 객체 생성

		if (args[0].equals("CFO")) {
			System.out.println("CFO is working.");
			fc.calculatePay();
		} else if (args[0].equals("COO")) {
			System.out.println("COO is working.");
			fc.reportHours();
		} else if (args[0].equals("CTO")) {
			System.out.println("CTO is working.");
			fc.save();
		} else {
			System.out.println("wrong input.");
			return;
		}

	}
}
