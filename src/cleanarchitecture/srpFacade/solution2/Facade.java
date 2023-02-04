package cleanarchitecture.srpFacade.solution2;


public class Facade {
	private EmployeeData ed = EmployeeData.getEmployeeDate();

	// 3 클래스의 객체를 생성하고, 요청된 메서드를 해당 객체로 위임한다.
	PayCalculator pc = new PayCalculator(ed);
	HourReporter hr = new HourReporter(ed);
	EmployeeSaver es = new EmployeeSaver(ed);

	public long calculatePay() {
		return pc.calculatePay();
	}

	public long reportHours() {
		return hr.reportHours();
	}

	public long save() {
		return es.save();
	}
}
