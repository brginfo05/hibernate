package hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import hibernate.model.Teste;
import hibernate.repository.TesteRepository;

@SpringBootApplication
public class Application {

    @Autowired
    private TesteRepository testeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        testeRepository.insert(new Teste(1));
        testeRepository.insert(new Teste(2));
        testeRepository.insert(new Teste(3));
    }
}
