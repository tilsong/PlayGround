package Etc;

public class FuncTest {
    public static void main(String[] args) {
        FunctionalI<String> fc = () -> "Func";
        String call = fc.call();
        System.out.println(call);
        fc.print();
        System.out.println(FunctionalI.a);
    }
}
