package br.com.adrianomenezes.userapihr.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;
import static lombok.EqualsAndHashCode.*;

@Entity(name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Include
    private Long id;

    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;


}
