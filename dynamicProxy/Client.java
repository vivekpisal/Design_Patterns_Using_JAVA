package dynamicProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String []args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ITEmployee itEmp = new ITEmployee(40000.0);
		EmployeeInvocationHandler empHandler = new EmployeeInvocationHandler(itEmp);
		IEmployee proxy = (IEmployee) Proxy.newProxyInstance(
				ITEmployee.class.getClassLoader(),
				new Class[] {IEmployee.class}, 
				empHandler);
		proxy.giveHike(30000);
		System.out.println(itEmp.getSalary());
	}
}