package pro;

import java.util.Optional;

public class StringTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object o = new Object();
        cObj cObj = new cObj(1);

        cObj clone = cObj.clone();
        System.out.println(cObj == clone);
        clone.a = 2;
        System.out.println(cObj == clone);
        System.out.println("cObj.a: " + cObj.a);


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

class cObj extends Object implements Cloneable{
    int a;

    public cObj(int a) {
        this.a = a;
    }

    @Override
    protected cObj clone() throws CloneNotSupportedException {
        return (cObj) super.clone();
    }
}
