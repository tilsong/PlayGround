package cleanarchitecture.srpFacade.solution1;

public class HourReporter { // COO 전용 클래스
	EmployeeData ed;

	public HourReporter(EmployeeData ed) {
		this.ed = ed;
	}

	public long reportHours() {
		System.out.println("report Hours");
		ed.setWorkingHour(10);
		return ed.getWorkingHour();
	}
}
