package OptionalTest;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> opStr1 = Optional.ofNullable("som");

        Name validName = opStr1.filter(s -> s.length() > 3)
                .map(Name::new)
                .orElseThrow(IllegalArgumentException::new);
        }
}


class Name{
    private final String name;
    public Name(final String name){
        if(name.length() <= 3){
            new IllegalArgumentException();
        }

        this.name = name;
    }
}