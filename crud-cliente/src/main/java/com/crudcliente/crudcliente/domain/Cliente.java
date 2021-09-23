package com.crudcliente.crudcliente.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CPF")
    private String cpf;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ENDEREÇO_ID")
    private Endereco enderco;
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "cliente", targetEntity = Telefone.class, fetch = FetchType.LAZY)
    private List<Telefone> telefone = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "cliente", targetEntity = Email.class, fetch = FetchType.LAZY)
    private List<Email> email = new ArrayList<>();

    public  Cliente(){}

}
