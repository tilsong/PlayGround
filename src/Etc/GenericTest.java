package Etc;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        Box<Integer, Double, Float, Long> box = new Box<>();
        box.add(1,3.0);
        box.add(2,4.0);
    }
}

class Box <L, R, C, K> {
    List<L> lefts = new ArrayList<>();
    List<R> rights = new ArrayList<>();

    public void add(L left, R right) {
        lefts.add(left);
        rights.add(right);
    }
}
