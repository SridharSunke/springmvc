
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Employeees;
import service.EmployeeesService;

public class App {
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Employeees em = new Employeees();
		em.setId(243);
		em.setName("John");
		em.setAge(35);
		EmployeeesService emService = (EmployeeesService) context.getBean("EmployeeesService");
		emService.persistEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById(123).getAge());
		em.setAge(32);
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById(123).getAge());
		// emService.deleteEmployee(em);
		context.close();
	}

}
