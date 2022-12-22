package br.com.adrianomenezes.userapihr;

import br.com.adrianomenezes.userapihr.domain.User;
import br.com.adrianomenezes.userapihr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiHrApplication implements CommandLineRunner {
//	@Autowired
//	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiHrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Ao inves deste recurso estou usando a configuração do LocalConfig
//		se usuar o codigo abaixo lembrar de descomentar o UserRepository (acima)
//		if (userRepository.count() <= 0) {
//			userRepository.saveAll(List.of(
//					new User(null, "valdir", "valdir@gmail.com", "123", 20.0)
//			));
//		}
	}
}
