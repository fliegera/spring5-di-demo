package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.MyController;
import guru.springframework.examplebeans.FakeDatasource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDatasource datasource = (FakeDatasource) ctx.getBean("fakeDatasource");

		System.out.println("USer " + datasource.getUser());

	}
}
