package com.eric.cadastro.entity;

import com.eric.cadastro.enumeration.TipoUsuarioEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclientes", nullable = false)
    private Integer id;

    @Column(name = "login", nullable = false, length = 45)
    private String login;

    @Column(name = "senha", nullable = false, length = 45)
    private String senha;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "dataCriacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "tipoUsuario", nullable = false)
    private TipoUsuarioEnum tipoUsuario;
}
