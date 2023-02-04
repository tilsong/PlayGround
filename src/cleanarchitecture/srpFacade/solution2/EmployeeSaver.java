package cleanarchitecture.srpFacade.solution2;

public class EmployeeSaver { // CTO 전용 클래스
	EmployeeData ed;

	public EmployeeSaver(EmployeeData ed) {
		this.ed = ed;
	}

	public long save() {
		System.out.println("save money");
		return 10;
	}
}
