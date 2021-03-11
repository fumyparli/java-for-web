package ga.fumyparli.diexam01;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Car {
	@Autowired // 밑에 setEngine 없애도 되지만 이게 필요함
	private Engine v8;

	public Car() {
		System.out.println("Car 생성자");
	}

	public void setEngine(Engine e) { // ComponentScan 쓸 때 없애도 됨
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
