package pl.javastart.dao;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.javastart.model.Client;
import pl.javastart.model.Order;

import javax.persistence.*;
import java.awt.print.Book;

@Repository
public class ClientDaoImpl implements  ClientDao {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;


    @Override
    public void saveClient(Client client) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(client);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void uptadeClient(Client client, Order order) {

    }


    @Override
    public void addOrder(Client client, Order order) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        Client updateClient = entityManager.find(Client.class, client.getId());
        if(updateClient != null) {
            updateClient.getOrders().add(order);
            entityTransaction.begin();
            entityManager.persist(order);
            entityTransaction.commit();
            entityManager.close();

        }

    }

    @Override
    public Client getClient(Long id) {
        return null;
    }
}
