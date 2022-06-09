package com.example.icaro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Client {
    @Id
    @Column(name = "CLIENTE_ID", nullable = false)
    private Long id;

    @Column(name="CLIENTE_NOME", nullable = false)
    private String nome;
    @Column(name="CLIENTE_CPF", nullable = false)
    private int CPF;
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
        this.CPF = CPF;
        this.email = email;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
