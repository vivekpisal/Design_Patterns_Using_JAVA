package proxy;

public class EmployeeDaoProxy implements EmployeeDao{
	private EmployeeDao empDao;
	
	public EmployeeDaoProxy() {
		empDao = new EmployeeDaoImpl();
	}

	@Override
	public void create(String role, Employee emp) {
		if(role == "ADMIN") {
			empDao.create(role, emp);
			return;
		}
		System.out.println("Access Denied");
	}

	@Override
	public Employee getEmployee(int id) {
		return empDao.getEmployee(id);
	}

	@Override
	public void updateEmployee(int id) {
		empDao.updateEmployee(id);
	}
	
	
}
