
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity();
        Class classEntity = entity.getClass();
        if (null != classEntity.getMethods()) {
            for (Method method : classEntity.getDeclaredMethods()) {
                System.out.print(method + " ");
                if (null != method.getAnnotations()) {
                    for (Annotation annotation : method.getAnnotations()) {
                        System.out.print(annotation + " ");
                    }
                    System.out.println("\n");
                }
            }
        }
    }
}
