package dao;

import entity.Employeees;

public interface EmployeeesDAO {

	void persistEmployee(Employeees employee);

	Employeees findEmployeeById(int id);

	void updateEmployee(Employeees employee);

	void deleteEmployee(Employeees employee);

}
