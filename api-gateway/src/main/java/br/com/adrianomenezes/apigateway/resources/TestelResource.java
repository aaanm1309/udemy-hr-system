package br.com.adrianomenezes.apigateway.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/gateway")
public class TestelResource {


    @GetMapping(value = "/teste")
    public ResponseEntity<Object> getTest(){
        return ResponseEntity.ok().body(
                "Teste OK");
    }
}
