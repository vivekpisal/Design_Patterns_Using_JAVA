package dynamicProxy;

public class ITEmployee implements IEmployee{

	private double salary;
	
	public ITEmployee(Double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void giveHike(double amount) {
		this.salary+=amount;
	}

	@Override
	public void cutSalary(double amount) {
		this.salary-=amount;
	}
	
}
