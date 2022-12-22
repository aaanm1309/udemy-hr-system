package br.com.adrianomenezes.userapihr.repositories;

import br.com.adrianomenezes.userapihr.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
