package cleanarchitecture.srpFacade.solution1;

public class PayCalculator { // CFO 전용 클래스
	EmployeeData ed;

	PayCalculator(EmployeeData ed) {
		this.ed = ed;
	}
	public long calculatePay() {
		System.out.println("calculate Pay");
		ed.setSalary(10);
		return ed.getSalary();
	}
}
