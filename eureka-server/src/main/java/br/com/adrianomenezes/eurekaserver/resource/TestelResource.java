package br.com.adrianomenezes.eurekaserver.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/server")
public class TestelResource {


    @GetMapping(value = "/teste")
    public ResponseEntity<Object> getTest(){
        return ResponseEntity.ok().body(
                "Teste OK");
    }
}
