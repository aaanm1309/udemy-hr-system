package br.com.adrianomenezes.userapihr.services.impl;

import br.com.adrianomenezes.userapihr.domain.User;
import br.com.adrianomenezes.userapihr.repositories.UserRepository;
import br.com.adrianomenezes.userapihr.services.UserService;
import br.com.adrianomenezes.userapihr.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
