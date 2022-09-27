package daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.EmployeeesDAO;
import entity.Employeees;

//@Repository("EmployeeesDAO")
public class EmployeeesDaoImpl implements EmployeeesDAO {

//	@Autowired
	private SessionFactory sessionFactory;

	public void persistEmployee(Employeees employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}

	public Employeees findEmployeeById(int id) {

		return (Employeees) sessionFactory.getCurrentSession().get(Employeees.class, id);
	}

	public void updateEmployee(Employeees employee) {
		sessionFactory.getCurrentSession().update(employee);

	}

	public void deleteEmployee(Employeees employee) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().delete(employee);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
