package reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tiger {
	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		String str = "methodA";

		Method m = Tiger.class.getMethod(str, Integer.class, Integer.class);
		m.invoke(m, 9, 6);

	}

	public static void methodA(Integer i, Integer j) {
		System.out.println(i + j);
	}
}
