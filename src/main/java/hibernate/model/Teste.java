package hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teste {

    @Id
    private long id;

    public Teste(long id) {
        this.id = id;
    }
}
