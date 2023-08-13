package proxy;

public interface EmployeeDao {
	void create(String role,Employee emp);
	Employee getEmployee(int id);
	void updateEmployee(int id);
}
