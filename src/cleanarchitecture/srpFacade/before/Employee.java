package cleanarchitecture.srpFacade.before;

public class Employee {
	// 아래 3개의 메서드는 모두 사용하는 액터가 다름.
	public long calculatePay() { // CFO 전용 메서드
		System.out.println("calculate Pay");
		regularHours();
		return 10;
	}

	public long reportHours() { // COO 전용 메서드
		System.out.println("report Hours");
		regularHours();
		return 10;
	}

	public long save() { // CTO 전용 메서드
		System.out.println("save money");
		return 10;
	}

	// calculatePay(), reportHours() 메서드의 코드 중복을 피하기 작성된 코드.
	// 하나 이상의 액터(CFO, COO)에 의해 사용되는 메서드들에 사용됨.
	//
	// [문제 상황]
	// 이 때, 한 액터가 필요에 의해 이 공용 메서드를 수정했을 경우, 다른 액터에게 영향이 가게 된다.
	// 이는 서로 다른 액터가 의존하는 코드를 너무 가까이 배치했기 때문이며,
	// SRP에 의해 서로 다른 액터가 의존하는 코드는 분리되어야 한다.
	// ===========================================
	// 이는 SRP를 위반한 사례로, 우발적 중복이라 명칭한다.
	// 다른 액터가 코드를 변경하여 코드 충돌이 나는 경우도 있는데, 이는 '병합' 문제라고 칭한다.
	private long regularHours() {
		System.out.println("calculate regularHours");
		return 10;
	}


}
