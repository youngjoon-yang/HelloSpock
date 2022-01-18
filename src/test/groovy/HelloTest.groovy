import spock.lang.Specification

class HelloTest extends Specification {
    def "Say Hello"() {
        given:
        def hello = new Hello();

        when:
        def sentence = hello.say();

        then:
        sentence == "Hello Spock";
    }

    def "Say Hello2"() {
        given:
        def hello = new Hello();

        expect:
        hello.say() == "Hello Spock";
    }

    def "Say Name"() {
        given:
        def hello = new Hello();

        when:
        def sentence = hello.say(name);

        then:
        expected == sentence;

        where:
        name | expected
        "johnny" | "Hello johnny"
        "rocket" | "Hello rocket"
    }

    def "Say mock"() {
        given:
        def hello = Mock(Hello.class);

        when:
        def sentence = hello.say();

        then:
        hello.say() >> "Hi"
        "Hi" == sentence;
    }
}
