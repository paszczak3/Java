package pl.javastart.dao;

import pl.javastart.model.Client;
import pl.javastart.model.Order;

public interface ClientDao {

    public void saveClient(Client client);
    public void uptadeClient(Client client, Order order);
    public void addOrder(Client client, Order order);
    public Client getClient(Long id);

}
