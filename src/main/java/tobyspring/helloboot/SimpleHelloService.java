package tobyspring.helloboot;

import org.springframework.stereotype.Component;

@Component
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHallo(String name) {
        return "Hello " + name;
    }
}
