package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler implements InvocationHandler{

	private IEmployee emp;
	
	public EmployeeInvocationHandler(IEmployee emp) {
		super();
		this.emp = emp;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		method.invoke(emp, args);	
		return null;
	}
	
}
