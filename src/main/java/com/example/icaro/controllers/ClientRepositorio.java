package com.example.icaro.controllers;

import com.example.icaro.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClientRepositorio extends JpaRepository <Client, Long> {
    List<Client> findByNome(String nome);

    List<Client> findById(long id);
    List<Client> deleteById(long id);

}
