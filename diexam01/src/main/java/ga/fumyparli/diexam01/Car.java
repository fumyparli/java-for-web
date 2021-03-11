package ga.fumyparli.diexam01;

public class Car {
	private Engine v8;

	public Car() {
		System.out.println("Car 생성자");
	}

	public void setEngine(Engine e) {
		this.v8 = e;
	}

	public void run() {
		System.out.println("엔진을 이용해서 달립니다.");
		v8.exec();
	}

//	public static void main(String[] argv) {
//		Engine e = new Engine();
//		Car c = new Car();
//		c.setEngine(e);
//		c.run();
//	}
}
