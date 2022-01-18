import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitHelloTest {
    @Test
    public void test_say_hello() {
        Hello hello = new Hello();

        assertEquals("Hello Spock", hello.say());
    }
}
