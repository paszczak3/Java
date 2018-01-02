package pl.javastart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.javastart.model.Book;
import pl.javastart.model.BookDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;



    @Override
    public void save(Book book) {
        BookDetails bookDetails = book.getBookDetails();
        if(bookDetails != null && bookDetails.getId() == null) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(bookDetails);
            entityManager.persist(book);
            entityTransaction.commit();
            entityManager.close();
        }
    }

    @Override
    public Book get(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Book book = entityManager.find(Book.class,id);
        entityManager.close();
        return book;
    }

    @Override
    public void update(Book book) {
        BookDetails bookDetails = book.getBookDetails();
        if(bookDetails != null) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(bookDetails);
            entityManager.merge(book);
            entityTransaction.commit();
            entityManager.close();
        }
    }

    @Override
    public void remove(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        Book removeBook = entityManager.find(Book.class, id);
        if (removeBook != null) {
            entityTransaction.begin();
            entityManager.remove(removeBook.getBookDetails());
            entityManager.remove(removeBook);
            entityTransaction.commit();
        }
        entityManager.close();
    }
}
