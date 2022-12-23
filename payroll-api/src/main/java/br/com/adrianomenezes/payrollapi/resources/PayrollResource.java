package br.com.adrianomenezes.payrollapi.resources;

import br.com.adrianomenezes.payrollapi.domain.Payroll;
import br.com.adrianomenezes.payrollapi.domain.UserDTO;
import br.com.adrianomenezes.payrollapi.feignClients.UserFeign;
import br.com.adrianomenezes.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/payments")
@RequiredArgsConstructor
public class PayrollResource {

    private final PayrollService service;


    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId,
                                              @RequestBody Payroll payroll){
        return ResponseEntity.ok().body(
                service.getPayment(workerId,payroll));
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<Object> getTest(){
        return ResponseEntity.ok().body(
                "Teste OK");
    }
}
