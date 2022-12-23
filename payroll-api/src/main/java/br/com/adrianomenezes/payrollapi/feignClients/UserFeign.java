package br.com.adrianomenezes.payrollapi.feignClients;

import br.com.adrianomenezes.payrollapi.domain.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name = "user-api-hr", url = "http://localhost:8090")
@FeignClient(name = "USER-API-HR")
public interface UserFeign {

    @GetMapping(value = "/api/v1/users/{id}")
    ResponseEntity<UserDTO> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<UserDTO>>findAll();
}
