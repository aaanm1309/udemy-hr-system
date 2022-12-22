package br.com.adrianomenezes.payrollapi.domain;

import lombok.*;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;

    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;


}
