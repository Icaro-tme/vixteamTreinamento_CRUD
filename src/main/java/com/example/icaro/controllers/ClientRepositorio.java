package com.example.icaro.controllers;

import com.example.icaro.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClientRepositorio extends JpaRepository <Client, Long> {

//    Client save(Client client);
//    List<Client> saveAll(List<Client> clients);

    List<Client> findAll();
    Client findById(long id);
    List<Client> findByNome(String nome);
    Client findByEmail(String email);
    Client findByCpf(int cpf);

    String deleteById(long id);

//    void updateClient(Client client);
}

