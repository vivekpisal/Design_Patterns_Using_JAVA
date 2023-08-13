package proxy;

public class Client {

	public static void main(String[] args) {
		EmployeeDao empDao = new EmployeeDaoProxy();
		empDao.create("USER", new Employee());
	}
}
