package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.ClientDao;
import pl.javastart.model.Client;
import pl.javastart.model.Order;

@SpringBootApplication
public class SpringDataO2mApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataO2mApplication.class, args);
		Client client = new Client("jan", "kowalski", "zadupie");
		ClientDao clientDao = ctx.getBean(ClientDao.class);
		clientDao.saveClient(client);

		Order order = new Order("parowki", "z miesa");
		clientDao.addOrder(client, order);

		Client client1 = new Client("przechuj","pajak","rudnik");
		Order order1 = new Order("parowki", "z miesa");
		clientDao.uptadeClient(client1, order1);

		ctx.close();
	}
}
