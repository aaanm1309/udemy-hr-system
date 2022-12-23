package br.com.adrianomenezes.userapihr.resources.impl;

import br.com.adrianomenezes.userapihr.domain.User;
import br.com.adrianomenezes.userapihr.resources.UserResource;
import br.com.adrianomenezes.userapihr.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/users")
@RequiredArgsConstructor
public class UserResourceImpl implements UserResource {

    private final UserService service;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<Object> getTest(){
        return ResponseEntity.ok().body(
                "Teste OK");
    }
}
