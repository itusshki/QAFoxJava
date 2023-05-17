package reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Lion {
	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		String str = "methodA";

		Method m = Lion.class.getMethod(str);
		m.invoke(m);
	}

	public static void methodA() {
		System.out.println("Inside methodA");
	}

}
