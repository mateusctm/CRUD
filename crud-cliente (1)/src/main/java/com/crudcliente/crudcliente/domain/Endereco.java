package com.crudcliente.crudcliente.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENDERECO_ID")
    private Long id;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "UF")
    private String UF;

    public Endereco(){}
}
