package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.BookDao;
import pl.javastart.dao.BookDaoImpl;
import pl.javastart.model.Book;
import pl.javastart.model.BookDetails;

@SpringBootApplication
public class SpringJpaBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaBootApplication.class, args);
		BookDao bookDao = ctx.getBean(BookDao.class);
		//bookDao.remove((long) 1);

			Book book = new Book("gowno","jozek","mailna");
			BookDetails bookDetails = new BookDetails(300,"17");
		//	book.setId((long) 6);
			//bookDao.update(book);
		///Book book = new Book("1234567890468", "Spring is so cool", "Javastart");
		//Book book2 = new Book("11111111","chuj" ,"gowno");
		//book.setBookDetails(bookDetails);
		//bookDao.save(book);

		Book book1 = bookDao.get((long) 1);
		System.out.print(book1.getBookDetails());


		ctx.close();

	}
}
