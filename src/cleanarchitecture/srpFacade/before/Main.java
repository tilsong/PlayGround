package cleanarchitecture.srpFacade.before;

public class Main {
	public static void main(String[] args) {
		Employee em = new Employee();

		if (args[0].equals("CFO")) {
			System.out.println("CFO is working.");
			em.calculatePay();
		} else if (args[0].equals("COO")) {
			System.out.println("COO is working.");
			em.reportHours();
		} else if (args[0].equals("CTO")) {
			System.out.println("CTO is working.");
			em.save();
		} else {
			System.out.println("wrong input.");
			return;
		}
	}
}