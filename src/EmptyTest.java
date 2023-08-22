import java.util.Collections;
import java.util.List;

public class EmptyTest {
    public static void main(String[] args) {
        List<Object> objects = Collections.emptyList();

        if (objects == null) {
            System.out.println("null");
        }
        if (objects.isEmpty()) {
            System.out.println("isEmpty");
        }
    }
}
