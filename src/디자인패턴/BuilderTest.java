package 디자인패턴;

public class BuilderTest {
	public static void main(String[] args) {
		Person kim = new Person
			.Builder("Kim", 20)
			.height(180)
			.weight(80)
			.build();

		System.out.println(kim);
	}
}

class Person {
	private final String name;
	private final int age;
	private final int height;
	private final int weight;

	public static class Builder {
		private String name   = "";
		private int age    = 0;
		private int height = 0;
		private int weight = 0;

		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Builder height(int v) {
			height = v;
			return this;
		}

		public Builder weight(int v) {
			weight = v;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person(Builder builder) {
		name = builder.name;
		age = builder.age;
		height = builder.height;
		weight = builder.weight;
	}

	@Override
	public String toString() {
		return "Person{" +
			"name='" + name + '\'' +
			", age=" + age +
			", height=" + height +
			", weight=" + weight +
			'}';
	}
}
