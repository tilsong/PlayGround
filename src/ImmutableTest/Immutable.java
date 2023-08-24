package ImmutableTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Immutable {

    String cannotChange = "a";
    List<Integer> unmoList = new ArrayList<>();

    public static void main(String[] args) {

        String b = "b";

        Immutable im = new Immutable();
        im.cannotChange = b;
        System.out.println(im.cannotChange);

        final String c = "c";
        im.cannotChange = c;
        System.out.println(im.cannotChange);

        im.unmoList.add(1);
        im.unmoList.add(2);

        for (int a: im.unmoList) {
            System.out.print(a + " ");
        }
        System.out.println();

//        var getList = im.getUnmoList();
        var getList = im.getCopyList();
        getList.add(3);
        for (int a: getList) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int a: im.unmoList) {
            System.out.print(a + " ");
        }

    }

    /**
     * 1. 불변 뷰 컬렉션을 통해 객체의 불변을 보장. 데이터를 변경하는 메소드를 실행할 경우 UnsupportedOperationException이 발생함.
     * 2. But 원본 객체가 변경될 경우 함께 변경된다는 점.
     */
    public List<Integer> getUnmoList() {
        return Collections.unmodifiableList(unmoList);
    }

    /**
     * 방어적 복사.
     * but, List의 요소가 Integer와 같은 불변 객체가 아니었다면 요소의 내용을 바꾸는 등의 불변 관련 문제가 발생할 수도 있음.
     */
    public List<Integer> getCopyList() {
        return new ArrayList<>(unmoList);
    }
}


