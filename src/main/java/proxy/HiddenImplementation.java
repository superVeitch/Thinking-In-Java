package proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void callHiddenMedthod(Object o, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method g = o.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(o);
    }
}
