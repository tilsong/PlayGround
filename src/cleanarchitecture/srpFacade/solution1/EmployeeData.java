package cleanarchitecture.srpFacade.solution1;

public class EmployeeData {
	private static EmployeeData ed;

	private long workingHour;
	private long salary;

	private EmployeeData() {}

	public static EmployeeData getEmployeeDate() {
		if (ed == null) {
			ed = new EmployeeData();
		}
		return ed;
	}

	public long  getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(long workingHour) {
		this.workingHour = workingHour;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
