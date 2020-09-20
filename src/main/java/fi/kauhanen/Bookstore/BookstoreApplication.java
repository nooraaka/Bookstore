package fi.kauhanen.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.kauhanen.Bookstore.domain.Book;
import fi.kauhanen.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean 
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book b1 = new Book("Kirja 1", "Maija Meikäläinen", 2009, "123-1233-2233", 35);
			Book b2 = new Book("Kirja 2", "Matti Teikäläinen", 2020, "123-2254-2233", 55);
			Book b3 = new Book("Kirja 3", "Mirjami Täkäläinen", 2019, "123-3654-2233", 20);
			
			repository.save(b1);
			repository.save(b2);
			repository.save(b3);
			
		};
	}

}
