package Etc;

public class ConcreTest {
    public static void main(String[] args) {
        AbsTest a = new AbsTest() {
            @Override
            void get() {
                System.out.println("get");
            }
        };

        a.get();
    }
}
