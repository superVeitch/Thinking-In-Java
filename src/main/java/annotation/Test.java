package annotation;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("annotation.AnnotationDemo");
        Method[] ms = c.getMethods();
        for (Method m : ms){
            boolean b = m.isAnnotationPresent(Status.class);
            if (b) {
                Status s = m.getAnnotation(Status.class);
                System.out.println(s.value());
            }
        }
    }
}
