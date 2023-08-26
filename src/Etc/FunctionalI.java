package Etc;

@FunctionalInterface
interface FunctionalI<T> {
    T call();

    default void print() {
        System.out.println("print" + a);
    }

    default void out() {
        System.out.println("out");
    }
}
