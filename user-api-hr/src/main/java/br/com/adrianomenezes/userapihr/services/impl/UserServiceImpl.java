package br.com.adrianomenezes.userapihr.services.impl;

import br.com.adrianomenezes.userapihr.domain.User;
import br.com.adrianomenezes.userapihr.repositories.UserRepository;
import br.com.adrianomenezes.userapihr.services.UserService;
import br.com.adrianomenezes.userapihr.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on FindById " + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        log.info("USER_SERVICE ::: Get request on FindAll " + env.getProperty("local.server.port") + " port");

        return repository.findAll();
    }
}
