package com.example.icaro.models;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Client {
    @Id
    @Column(name = "CLIENTE_ID", unique=true, nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="CLIENTE_NOME", nullable = false)
    private String nome;
    @Column(name="CLIENTE_CPF", nullable = false)
    private int cpf;
    @Column(name="CLIENTE_EMAIL", nullable = false)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Client(){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
