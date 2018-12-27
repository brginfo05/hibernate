package hibernate.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import hibernate.model.Teste;

@Repository
public class TesteRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insert(Teste teste) {
        Session session = entityManager.unwrap(Session.class);
        session.save(teste);
    }
}
