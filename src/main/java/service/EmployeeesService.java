package service;

import entity.Employeees;

public interface EmployeeesService {
	void persistEmployee(Employeees employee);

	Employeees findEmployeeById(int id);

	void updateEmployee(Employeees employee);

	void deleteEmployee(Employeees employee);
}
