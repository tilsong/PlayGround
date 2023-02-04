package HashTest;

import java.util.ArrayList;
import java.util.HashMap;

class NewT extends Thread {
}
public class hashTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		// 오버라이딩 하지 않았을 경우, hashCode()와 identityHashCode()의 반환값은 동일하다.
		// 이는 오버라이딩 하지 않은 hashCode()가 identityHashCode와 내부적으로 동일한 로직을 사용함을 추측할 수 있다.
		System.out.println("obj1.hashCode(): " + obj1.hashCode());
		System.out.println("obj2.hashCode(): " + obj2.hashCode());

		System.out.println("obj1.identityHashCode(): " + System.identityHashCode(obj1));
		System.out.println("obj2.identityHashCode(): " + System.identityHashCode(obj2));


		String s1 = new String("s1");
		String s2 = new String("s1");

		System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("s2.hashCode(): " + s2.hashCode());

		System.out.println("s1.identityHashCode(): " + System.identityHashCode(s1));
		System.out.println("s2.identityHashCode(): " + System.identityHashCode(s2));


		String s3 = "s3";
		String s4 = "s4";

		System.out.println("s3.hashCode(): " + s3.hashCode());
		System.out.println("s4.hashCode(): " + s4.hashCode());

		System.out.println("s3.identityHashCode(): " + System.identityHashCode(s3));
		System.out.println("s4.identityHashCode(): " + System.identityHashCode(s4));
	}
}
