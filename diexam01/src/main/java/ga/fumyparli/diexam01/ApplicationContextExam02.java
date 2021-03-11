package ga.fumyparli.diexam01;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class ApplicationContextExam02 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		Car car = (Car) ac.getBean("c");
		car.run();
	}
}
