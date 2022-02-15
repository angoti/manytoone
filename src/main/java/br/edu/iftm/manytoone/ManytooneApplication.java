package br.edu.iftm.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManytooneApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
	ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManytooneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria c1 = new Categoria(null, "alimentos");

		Item i1 = new Item(null, "bolacha", c1);
		Item i2 = new Item(null, "arroz", c1);
		Item i3 = new Item(null, "feijão", c1);
		Item i4 = new Item(null, "pão", c1);

		categoriaRepository.save(c1);

		itemRepository.save(i1);
		itemRepository.save(i2);
		itemRepository.save(i3);
		itemRepository.save(i4);
	}

}
