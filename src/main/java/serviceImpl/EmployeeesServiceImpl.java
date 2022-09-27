package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.EmployeeesDAO;
import entity.Employeees;
import service.EmployeeesService;


public class EmployeeesServiceImpl implements EmployeeesService {


	EmployeeesDAO employeeesDAO;
	public EmployeeesServiceImpl(EmployeeesDAO employeeesDAO) {
		this.employeeesDAO = employeeesDAO;
	}

	@Transactional
	public void persistEmployee(Employeees employee) {
		employeeesDAO.persistEmployee(employee);
	}

	@Transactional
	public Employeees findEmployeeById(int id) {

		return employeeesDAO.findEmployeeById(id);
	}

	@Transactional
	public void updateEmployee(Employeees employee) {
		employeeesDAO.updateEmployee(employee);

	}

	@Transactional
	public void deleteEmployee(Employeees employee) {
		employeeesDAO.deleteEmployee(employee);
	}

	public EmployeeesDAO getEmployeeesDAO() {
		return employeeesDAO;
	}

	public void setEmployeeesDAO(EmployeeesDAO employeeesDAO) {
		this.employeeesDAO = employeeesDAO;
	}

}
