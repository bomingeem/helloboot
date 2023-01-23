package tobyspring.helloboot;

public class SimpleHelloService implements HelloService {
    @Override
    public String sayHallo(String name) {
        return "Hello " + name;
    }
}
