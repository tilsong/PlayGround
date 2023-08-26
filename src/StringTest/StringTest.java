package StringTest;

import java.util.Optional;

public class StringTest {
    public static void main(String[] args) {
        String str = "str";
        final Integer a = null;
        printConstant(str);

        String t = "";
        for (int i = 0; i < 1000; i++) {
            t += i;
        }
    }

    public static void printConstant(String str) {
        Optional<String> s = str.describeConstable();

        String s1 = s.orElseThrow();
        System.out.println(s1);
    }
}
