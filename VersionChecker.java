import java.lang.reflect.Method;

public class VersionChecker {
    public static void main(String[] args) {
        Method[] methods = Software.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Version.class)) {
                Version version = method.getAnnotation(Version.class);
                System.out.println("Method: " + method.getName() + ", Version: " + version.number() + " Author: " + version.author());
            }
        }
    }
}
