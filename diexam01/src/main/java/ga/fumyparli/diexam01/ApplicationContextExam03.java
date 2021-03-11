package ga.fumyparli.diexam01;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class ApplicationContextExam03 {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		Car car = (Car) ac.getBean("car"); 이렇게도 할 수 있고
		Car car = ac.getBean(Car.class); // 이렇게 클래스명으로 찾을 수도 있음
		car.run();
	}

}
