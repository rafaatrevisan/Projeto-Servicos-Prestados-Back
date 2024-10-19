package io.github.rafaatrevisan.clientes.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotEmpty(message = "{campo.nomeLogin.obrigatorio}")
    private String nome;

    @Column(unique = true)
    @NotEmpty(message = "{campo.emailLogin.obrigatorio}")
    @Email(message = "{campo.emailLogin.invalido}")
    private String email;

    @Column
    @NotEmpty(message = "{campo.senhaLogin.obrigatorio}")
    private String senha;
}
