package br.com.adrianomenezes.userapihr.services;

import br.com.adrianomenezes.userapihr.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();

}
